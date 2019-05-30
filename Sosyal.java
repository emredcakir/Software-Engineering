package com.example.volki.companymobileapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Sosyal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sosyal);
    }

    public void onClickFacebook(View v) {




        Uri uri2 = Uri.parse("https://www.facebook.com/vatan.peugeot.ankara.ozel.servis");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri2);
        startActivity(intent);

    }


    public void onClickintagram(View view){



        Uri uri2 = Uri.parse("https://instagram.com/vatan_peugeot/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri2);
        startActivity(intent);
    }


    public void onClickTwitter(View v) {


        Uri uri2 = Uri.parse("https://twitter.com/vatanpeugeot");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri2);
        startActivity(intent);

    }

    public void onClickGooglePlus(View v) {



        Uri uri2 = Uri.parse("https://plus.google.com/117187907617101035890/posts");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri2);
        startActivity(intent);

    }

    public void onClickFourSquare(View v) {




        Uri uri2 = Uri.parse("https://tr.foursquare.com/v/vatan-peugeot/4ee3127ce4b0e39159c641af");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri2);
        startActivity(intent);

    }



}
