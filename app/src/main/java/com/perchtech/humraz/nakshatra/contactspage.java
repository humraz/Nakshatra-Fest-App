package com.perchtech.humraz.nakshatra;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.dexafree.materialList.card.Card;
import com.dexafree.materialList.card.CardProvider;
import com.dexafree.materialList.card.OnActionClickListener;
import com.dexafree.materialList.card.action.TextViewAction;
import com.dexafree.materialList.view.MaterialListView;
import com.squareup.picasso.RequestCreator;


public class contactspage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactspage);
        setevents();
    }
    public void setevents() {
        final MaterialListView mListView = (MaterialListView) findViewById(R.id.material_listview);
        @SuppressLint("ResourceAsColor") final Card card3 = new Card.Builder(this)
                .withProvider(new CardProvider())
                .setLayout(R.layout.material_basic_image_buttons_card_layout)
                .setTitle("Mr. Krishna Namboothiri")

                .setTitleGravity(Gravity.END)
                .setDescription("(+91)-9946852130")
                .setDescriptionGravity(Gravity.END)
                .setDrawable(R.drawable.ph)
                .setDrawableConfiguration(new CardProvider.OnImageConfigListener() {
                    @Override
                    public void onImageConfigure(@NonNull RequestCreator requestCreator) {
                        requestCreator.fit();
                    }
                })

                .addAction(R.id.right_text_button, new TextViewAction(this)
                        .setText("Call")
                        .setTextResourceColor(R.color.blue_btn_bg_color)
                        .setListener(new OnActionClickListener() {
                            @Override
                            public void onActionClicked(View view, Card card) {
                                //    Intent in = new Intent(events.this, agentcodelypage.class);
                                // startActivity(in);
                                String a1 = "9946852130";
                                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + a1)));
                                card.dismiss();
                            }
                        }))
                .endConfig()
                .build();

        mListView.getAdapter().add(card3);
        @SuppressLint("ResourceAsColor") final Card card4 = new Card.Builder(this)
                .withProvider(new CardProvider())
                .setLayout(R.layout.material_basic_image_buttons_card_layout)
                .setTitle("Mr. Humraz Hussain")

                .setTitleGravity(Gravity.END)
                .setDescription(" (+91)-8589088891")
                .setDescriptionGravity(Gravity.END)
                .setDrawable(R.drawable.ph)
                .setDrawableConfiguration(new CardProvider.OnImageConfigListener() {
                    @Override
                    public void onImageConfigure(@NonNull RequestCreator requestCreator) {
                        requestCreator.fit();
                    }
                })

                .addAction(R.id.right_text_button, new TextViewAction(this)
                        .setText("Call")
                        .setTextResourceColor(R.color.blue_btn_bg_color)
                        .setListener(new OnActionClickListener() {
                            @Override
                            public void onActionClicked(View view, Card card) {
                              //  Intent in = new Intent(events.this, agentcodelypage.class);
                               // startActivity(in);
                                String a1 = "9946852130";
                                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + a1)));
                                card.dismiss();
                            }
                        }))
                .endConfig()
                .build();

        mListView.getAdapter().add(card4);
        @SuppressLint("ResourceAsColor") final Card card5 = new Card.Builder(this)
                .withProvider(new CardProvider())
                .setLayout(R.layout.material_basic_image_buttons_card_layout)
                .setTitle("Mr. John Weels")

                .setTitleGravity(Gravity.END)
                .setDescription(" (+91)-8589088891")
                .setDescriptionGravity(Gravity.END)
                .setDrawable(R.drawable.ph)
                .setDrawableConfiguration(new CardProvider.OnImageConfigListener() {
                    @Override
                    public void onImageConfigure(@NonNull RequestCreator requestCreator) {
                        requestCreator.fit();
                    }
                })

                .addAction(R.id.right_text_button, new TextViewAction(this)
                        .setText("Call")
                        .setTextResourceColor(R.color.blue_btn_bg_color)
                        .setListener(new OnActionClickListener() {
                            @Override
                            public void onActionClicked(View view, Card card) {
                               // Intent in = new Intent(events.this, agentcodelypage.class);
                               // startActivity(in);
                                String a1 = "9946852130";
                                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + a1)));
                                card.dismiss();
                            }
                        }))
                .endConfig()
                .build();

        mListView.getAdapter().add(card5);
    }

}
