package com.example.volki.companymobileapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Iletisim extends AppCompatActivity
{


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iletisim);
    }

    public void ara(View view){

        try {

            String uri = "tel:"+"+903123851145";

            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(uri));

            startActivity(callIntent);

        }catch(Exception e) {

            Toast.makeText(getApplicationContext(),"Arama basarisiz...",

                    Toast.LENGTH_LONG).show();

            e.printStackTrace();

        }

    }

    public void onClickHaritalar(View view){

      /* Intent i=new Intent(iletisim.this,googlemaps.class);
        startActivity(i);
*/

        Uri uri = Uri.parse("https://www.google.com/maps/dir//Vatan+Peugeot,+Ostim+Mh.,+1180.+Sk+(10.+Sk.),+06105+Ankara/@39.961143,32.754567,17z/data=!4m13!1m4!3m3!1s0x14d34a29f233e785:0xcc455b3e98cf2cbd!2sVatan+Peugeot!3b1!4m7!1m0!1m5!1m1!1s0x14d34a29f233e785:0xcc455b3e98cf2cbd!2m2!1d32.754567!2d39.961143");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }

    public void  sendMail(View view){

        Intent i=new Intent(Iletisim.this ,MailGonder.class);
        startActivity(i);


    }

    public void  onClickSosyal(View view){

        Intent i=new Intent(Iletisim.this ,Sosyal.class);
        startActivity(i);


    }

    public void mm(View view){

        Intent i=new Intent(Iletisim.this,GoggleMaps.class);
        startActivity(i);

    }


}
