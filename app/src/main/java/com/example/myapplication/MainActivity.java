package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean imageView5IsShowing = true;

    public void fade(View view) {
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);

        if(imageView5IsShowing) {
            imageView5IsShowing = false;
//            imageView5.animate().alpha(0).setDuration(2000);
            imageView5.animate().translationYBy(2000).setDuration(2000);
            imageView6.animate().alpha(1).setDuration(2000);
        } else {
            imageView5IsShowing = true;
//            imageView5.animate().alpha(1).setDuration(2000);
            imageView5.animate().translationYBy(-2000).setDuration(2000);
            imageView6.animate().alpha(0).setDuration(2000);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setX(-1000);
        imageView5.animate().translationXBy(1000).rotation(3600).setDuration(2000);

    }
}