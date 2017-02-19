package com.perchtech.humraz.nakshatra;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.HamButton;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;


public class menuscreen extends ActionBarActivity {
    static int[] imageResources = new int[]{
            R.drawable.maps,
            R.drawable.calendar,
            R.drawable.spp,
            R.drawable.contacts,



    };
    static int[] Strings = new int[]{
            R.string.maps,
            R.string.events,
            R.string.forum,
            R.string.contacts,




    };
    static int imageResourceIndex = 0;
    static int str = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuscreen);
        BoomMenuButton bmb = (BoomMenuButton) findViewById(R.id.bmb);
        bmb.setButtonEnum(ButtonEnum.Ham);
        bmb.setPiecePlaceEnum(PiecePlaceEnum.HAM_4);
        bmb.setButtonPlaceEnum(ButtonPlaceEnum.HAM_4);
        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
            HamButton.Builder builder = new HamButton.Builder()
                    .normalTextRes(getString())
                    .listener(new OnBMClickListener() {
                        @Override
                        public void onBoomButtonClick(int index) {


                            if (index == 0) {
                                start(index);

                            }
                            if (index == 1) {
                                orderingg(index);
                            }
                            if (index == 2) {
                               stock(index);

                            }
                            if (index == 3) {
                                sales(index);
                            }

                        }
                    })

                    .normalImageRes(getImageResource());
            bmb.addBuilder(builder);
        }
    }
    public static int getString() {
        if (str >= Strings.length) str = 0;
        return Strings[str++];
    }
    public static int getImageResource() {
        if (imageResourceIndex >= imageResources.length) imageResourceIndex = 0;
        return imageResources[imageResourceIndex++];
    }
    public void start(int pos)
    {
        //   Toast.makeText(this, Integer.toString(pos), Toast.LENGTH_LONG).show();
        Intent in = new Intent( this, MapsActivity.class);
        startActivity(in);
    }
    public void stock(int pos)
    {
        //   Toast.makeText(this, Integer.toString(pos), Toast.LENGTH_LONG).show();
        Intent in = new Intent( this, Attend.class);
        startActivity(in);
    }
    public void orderingg(int pos)
    {
        //   Toast.makeText(this, Integer.toString(pos), Toast.LENGTH_LONG).show();
        Intent in = new Intent( this, events.class);
        startActivity(in);
    }
    public void sales(int pos)
    {
        //   Toast.makeText(this, Integer.toString(pos), Toast.LENGTH_LONG).show();
        Intent in = new Intent( this, contactspage.class);
        startActivity(in);
    }


}
