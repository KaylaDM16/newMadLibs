package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText tvName, tvColor, tvNoun, tvAdjective, tvDay, tvItem, tvWord, tvRandom;
    private Button btnGenerate

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.tv_name);
        tvColor = findViewById(R.id.tv_color);
        tvNoun = findViewById(R.id.tv_noun);
        tvAdjective = findViewById(R.id.tv_adjective);
        tvDay = findViewById(R.id.tv_day);
        tvItem = findViewById(R.id.tv_item);
        tvWord = findViewById(R.id.tv_word);
        tvRandom = findViewById(R.id.tv_random);
        tvNoun = findViewById(R.id.tv_noun);

        btnGenerate = findViewById(R.id.btn_generate);

        Intent intentDisplay = new Intent(MainActivity.this, DisplayActivity.class);

        @Override
        public void onClick(View v){

            String story = " "
            story += "\ "


            intentDisplay.putExtra(name"story", story);
            startActivity(intentDisplay);
         }
        }};
    }
}