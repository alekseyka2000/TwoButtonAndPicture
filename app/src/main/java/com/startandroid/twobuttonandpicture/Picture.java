package com.startandroid.twobuttonandpicture;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class Picture extends AppCompatActivity {

    ImageView imageView;
    String URL = "http://karavan.md/uploads/nHoliday/67/67c6a1e7ce56d3d6fa748ab6d9af3fd7.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
    }
}
