package com.example.volki.companymobileapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class GalleryMekanik extends AppCompatActivity {


    ImageView selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallerymekanik);

        Gallery gallery = (Gallery) findViewById(R.id.gallery);
        selectedImage=(ImageView)findViewById(R.id.imageView);
        gallery.setSpacing(1);
        final GalleryImageAdapterMekanik galleryImageAdapterMekanik= new GalleryImageAdapterMekanik(this);
        gallery.setAdapter(galleryImageAdapterMekanik);


        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // show the selected Image
                selectedImage.setImageResource(galleryImageAdapterMekanik.mekanikImageIds[position]);
            }
        });
    }

}