package com.perchtech.humraz.nakshatra;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class Attend extends ActionBarActivity {
    private EditText editTextName;
    private EditText editTextAddress;
    private TextView textViewPersons;
    private TextView textViewPersons2;
    private Button buttonSave;
    String url="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attend);
        Firebase.setAndroidContext(this);
//SharedPreferences prefs3=null;
        String url2="";
       // prefs3=getSharedPreferences("classn", MODE_PRIVATE);
      //  url2=prefs3.getString("classnamee", "null");
      //  System.out.println(url2);
url="https://nakshatra-6745a.firebaseio.com/Forum";
System.out.println(url);
        buttonSave = (Button) findViewById(R.id.buttonSave);
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextAddress = (EditText) findViewById(R.id.editTextAddress);

        textViewPersons = (TextView) findViewById(R.id.textView);

        textViewPersons2 = (TextView) findViewById(R.id.tv3);


    }
    public void go(View view)
    {
       read();
    }

    public void read()
    {

        final Firebase ref = new Firebase(url);
        //Value event listener for realtime data update
        final StringBuilder finalTotal=new StringBuilder();
        final StringBuilder finalTotal2=new StringBuilder();
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot usersSnapshot) {

                for (DataSnapshot userSnapshot : usersSnapshot.getChildren()) {
                    Person user = userSnapshot.getValue(Person.class);

                    finalTotal.append(user.getPost());
                    finalTotal.append("\n\n");

                    textViewPersons.setText(finalTotal.toString());
                   // textViewPersons2.setText(finalTotal2.toString());

                }

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
                System.out.println("The read failed: " + firebaseError.getMessage());
            }
        });

    }





    public void onlick(View v){
        //Creating firebase object
        Firebase ref = new Firebase(url);

        //Getting values to store
        String name = editTextName.getText().toString().trim();
      //  String address = editTextAddress.getText().toString().trim();

        //Creating Person object
        Person person = new Person();

        //Adding values
        person.setPost(name);
      //  person.setAddress(address);

        //Storing values to firebase
        ref.push().setValue(person);
        editTextAddress.setText("");
        editTextName.setText("");
      //  Toast.makeText(this, "Enter next Record", Toast.LENGTH_LONG).show();
        read();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
