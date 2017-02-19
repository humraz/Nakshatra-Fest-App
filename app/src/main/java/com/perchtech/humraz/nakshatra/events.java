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
import com.squareup.picasso.RequestCreator;


public class events extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        setevents();
    }




    public void setevents()
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

                .addAction(R.id.right_text_button, new TextViewAction(this)
                        .setText("More Details")
                        .setTextResourceColor(R.color.blue_btn_bg_color)
                        .setListener(new OnActionClickListener() {
                            @Override
                            public void onActionClicked(View view, Card card) {
                              Intent in = new Intent(events.this, agentcodelypage.class);
                                startActivity(in);
                                card.dismiss();
                            }
                        }))
                .endConfig()
                .build();

        mListView.getAdapter().add(card3);
        @SuppressLint("ResourceAsColor") final Card card4 = new Card.Builder(this)
                .withProvider(new CardProvider())
                .setLayout(R.layout.material_basic_image_buttons_card_layout)
                .setTitle("C DEBUGGING")

                .setTitleGravity(Gravity.END)
                .setDescription("EVERY HERO HAS A CODE")
                .setDescriptionGravity(Gravity.END)
                .setDrawable(R.drawable.cdebugging)
                .setDrawableConfiguration(new CardProvider.OnImageConfigListener() {
                    @Override
                    public void onImageConfigure(@NonNull RequestCreator requestCreator) {
                        requestCreator.fit();
                    }
                })

                .addAction(R.id.right_text_button, new TextViewAction(this)
                        .setText("More Details")
                        .setTextResourceColor(R.color.blue_btn_bg_color)
                        .setListener(new OnActionClickListener() {
                            @Override
                            public void onActionClicked(View view, Card card) {
                                Toast.makeText(getApplicationContext(), "Agent Codly Page " + card.getProvider().getTitle(), Toast.LENGTH_SHORT).show();
                                card.dismiss();
                            }
                        }))
                .endConfig()
                .build();


        @SuppressLint("ResourceAsColor") final Card card5 = new Card.Builder(this)
                .withProvider(new CardProvider())
                .setLayout(R.layout.material_basic_image_buttons_card_layout)
                .setTitle("CIRCUIT DEBUGGING")

                .setTitleGravity(Gravity.END)
                .setDescription("SMALL BUG? JUST STEP ON IT. BIG BUG? YOU ARE GONNA NEED MORE TOOLS")
                .setDescriptionGravity(Gravity.END)
                .setDrawable(R.drawable.circuit)
                .setDrawableConfiguration(new CardProvider.OnImageConfigListener() {
                    @Override
                    public void onImageConfigure(@NonNull RequestCreator requestCreator) {
                        requestCreator.fit();
                    }
                })

                .addAction(R.id.right_text_button, new TextViewAction(this)
                        .setText("More Details")
                        .setTextResourceColor(R.color.blue_btn_bg_color)
                        .setListener(new OnActionClickListener() {
                            @Override
                            public void onActionClicked(View view, Card card) {
                                Toast.makeText(getApplicationContext(), "Agent Codly Page " + card.getProvider().getTitle(), Toast.LENGTH_SHORT).show();
                                card.dismiss();
                            }
                        }))
                .endConfig()
                .build();


        @SuppressLint("ResourceAsColor") final Card card6 = new Card.Builder(this)
                .withProvider(new CardProvider())
                .setLayout(R.layout.material_basic_image_buttons_card_layout)
                .setTitle("CIRCUIT DEBUGGING")

                .setTitleGravity(Gravity.END)
                .setDescription("ARE YOU READY TO BECOME THE NEXT BIG DEBUGGER")
                .setDescriptionGravity(Gravity.END)
                .setDrawable(R.drawable.engineer)
                .setDrawableConfiguration(new CardProvider.OnImageConfigListener() {
                    @Override
                    public void onImageConfigure(@NonNull RequestCreator requestCreator) {
                        requestCreator.fit();
                    }
                })

                .addAction(R.id.right_text_button, new TextViewAction(this)
                        .setText("More Details")
                        .setTextResourceColor(R.color.blue_btn_bg_color)
                        .setListener(new OnActionClickListener() {
                            @Override
                            public void onActionClicked(View view, Card card) {
                                Toast.makeText(getApplicationContext(), "Agent Codly Page " + card.getProvider().getTitle(), Toast.LENGTH_SHORT).show();
                                card.dismiss();
                            }
                        }))
                .endConfig()
                .build();


        mListView.getAdapter().add(card4);
        mListView.getAdapter().add(card5);
        mListView.getAdapter().add(card6);
      //  mListView.getAdapter().add(card3);

    }


}
