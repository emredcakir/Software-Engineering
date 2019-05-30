package com.example.volki.companymobileapp;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GalleryKaporta extends  AppCompatActivity {


    ImageView selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallerykaporta);

        Gallery gallery = (Gallery) findViewById(R.id.gallery);
        selectedImage=(ImageView)findViewById(R.id.imageView);
        gallery.setSpacing(1);
        final GalleryImageAdapter galleryImageAdapterKaporta= new GalleryImageAdapter(this);
        gallery.setAdapter(galleryImageAdapterKaporta);


        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // show the selected Image
                selectedImage.setImageResource(galleryImageAdapterKaporta.mImageIds[position]);
            }
        });
    }

}