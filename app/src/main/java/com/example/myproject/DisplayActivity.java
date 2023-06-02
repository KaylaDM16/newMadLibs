package com.example.myproject;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    private TextView tvStory;
    @Override
    protected void onCreate(Bundle savedInstancesState) {
        super .onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tvstory = findViewById(R.id.tv_story);

        Intent intent = getIntent();

        String story = intent.getStringExtra(name:"story");

        tvStory.settext(story);

    }
}
