package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MadlibDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madlib_display);


        String story = getIntent().getStringExtra("story");

        TextView tvStory = findViewById(R.id.tv_story);

        tvStory.setText(R.id.tv_story);


    }
}