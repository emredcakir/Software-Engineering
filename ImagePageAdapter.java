package com.example.volki.companymobileapp;

import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.Map;


public class ImagePageAdapter extends PagerAdapter {


    private final Activity activity;
    private int[] imagesId;
    Map<Integer, View> imageViews = new HashMap<Integer, View>();

    public ImagePageAdapter(Activity activity, int[] imagesId) {
        this.activity = activity;
        this.imagesId = imagesId;
    }

    public Map<Integer, View> getImageViews() {
        return imageViews;
    }

    @Override
    public int getCount() {
        return imagesId.length;
    }

    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = activity.getLayoutInflater();

        View view = inflater.inflate(R.layout.adapter, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        imageView.setImageResource(imagesId[position]);
        container.addView(view);
        imageViews.put(position, imageView);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((FrameLayout) object);
    }
}
