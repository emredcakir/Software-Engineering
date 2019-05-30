package com.example.volki.companymobileapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class GoggleMaps extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.googlemaps);

        Uri uri = Uri.parse("https://www.google.com/maps/dir//Vatan+Peugeot,+Ostim+Mh.,+1180.+Sk+(10.+Sk.),+06105+Ankara/@39.961143,32.754567,17z/data=!4m13!1m4!3m3!1s0x14d34a29f233e785:0xcc455b3e98cf2cbd!2sVatan+Peugeot!3b1!4m7!1m0!1m5!1m1!1s0x14d34a29f233e785:0xcc455b3e98cf2cbd!2m2!1d32.754567!2d39.961143");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);


    }

}
