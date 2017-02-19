package com.perchtech.humraz.nakshatra;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.dexafree.materialList.card.Card;
import com.dexafree.materialList.card.CardProvider;
import com.dexafree.materialList.card.OnActionClickListener;
import com.dexafree.materialList.card.action.TextViewAction;
import com.dexafree.materialList.view.MaterialListView;
import com.firebase.client.Firebase;
import com.squareup.picasso.RequestCreator;


public class agentcodelypage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agentcodelypage);
        Firebase.setAndroidContext(this);
        show();
    }

  public void show()
  {
      final MaterialListView mListView = (MaterialListView) findViewById(R.id.material_listview);
      @SuppressLint("ResourceAsColor") final Card card3 = new Card.Builder(this)
              .withProvider(new CardProvider())
              .setLayout(R.layout.material_basic_image_buttons_card_layout)
              .setTitle("Agent Codly")

              .setTitleGravity(Gravity.END)
              .setDescription("ARE YOU READY TO BECOME THE NEXT CODING AGENT?")
              .setDescriptionGravity(Gravity.END)
              .setDrawable(R.drawable.agent)
              .setDrawableConfiguration(new CardProvider.OnImageConfigListener() {
                  @Override
                  public void onImageConfigure(@NonNull RequestCreator requestCreator) {
                      requestCreator.fit();
                  }
              })


              .endConfig()
              .build();
      @SuppressLint("ResourceAsColor") final Card car4 = new Card.Builder(this)
              .withProvider(new CardProvider())
              .setLayout(R.layout.material_basic_image_buttons_card_layout)
              .setTitle("Press Button To Register ")

              .setTitleGravity(Gravity.END)
              .setDescription("Pres The Button To Register With Your Name And Phone Number")
              .setDescriptionGravity(Gravity.END)
              .setDrawable(R.drawable.notepad)

              .addAction(R.id.right_text_button, new TextViewAction(this)
                      .setText("Register")
                      .setTextResourceColor(R.color.blue_btn_bg_color)
                      .setListener(new OnActionClickListener() {
                          @Override
                          public void onActionClicked(View view, Card card) {
                            //  Intent in = new Intent(events.this, agentcodelypage.class);
                            //  startActivity(in);
                              Firebase ref = new Firebase("https://nakshatra-6745a.firebaseio.com/Registrations");

                              //Getting values to store
                              //String name = editTextName.getText().toString().trim();
                              //  String address = editTextAddress.getText().toString().trim();
String name="Humraz Hussain";
                              String number="9633239292";
                              //Creating Person object
                              pp person = new pp();

                              //Adding values
                              person.setPost(name);
                              person.setNumber(number);
                              //  person.setAddress(address);

                              //Storing values to firebase
                              ref.push().setValue(person);
                              card.dismiss();
                          }
                      }))
              .setDrawableConfiguration(new CardProvider.OnImageConfigListener() {
                  @Override
                  public void onImageConfigure(@NonNull RequestCreator requestCreator) {
                      requestCreator.fit();
                  }
              })


              .endConfig()
              .build();
      mListView.getAdapter().add(card3);
      
      mListView.getAdapter().add(car4);
  }
}
