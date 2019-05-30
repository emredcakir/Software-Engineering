package com.example.volki.companymobileapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GalleryImageAdapterMekanik extends BaseAdapter {


    private Context mContext;



    public GalleryImageAdapterMekanik(Context context)
    {
        mContext = context;
    }

    public int getCount() {
        return mekanikImageIds.length;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }


    // Override this method according to your need
    public View getView(int index, View view, ViewGroup viewGroup)
    {
        // TODO Auto-generated method stub
        ImageView i = new ImageView(mContext);

        i.setImageResource(mekanikImageIds[index]);
        i.setLayoutParams(new Gallery.LayoutParams(200, 200));

        i.setScaleType(ImageView.ScaleType.FIT_XY);




        return i;
    }




    public Integer[] mekanikImageIds = {
            R.drawable.mekanikbir,
            R.drawable.mekanikiki,
            R.drawable.mekanikuc,


    };


}