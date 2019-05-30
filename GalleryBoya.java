package com.example.volki.companymobileapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class GalleryBoya extends  AppCompatActivity {


    ImageView selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galleryboya);

        Gallery gallery = (Gallery) findViewById(R.id.gallery);
        selectedImage=(ImageView)findViewById(R.id.imageView);
        gallery.setSpacing(1);
        final GalleryImageAdapterBoya galleryImageAdapterBoya= new GalleryImageAdapterBoya(this);
        gallery.setAdapter(galleryImageAdapterBoya);


        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // show the selected Image
                selectedImage.setImageResource(galleryImageAdapterBoya.boyaImageIds[position]);
            }
        });
    }

}