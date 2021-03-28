package com.example.android_fundamentals_021_activities_and_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class ActText1 extends AppCompatActivity {

    TextView tv_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_act_text1);
        tv_text = findViewById(R.id.tV_text);

        Intent intent = getIntent();

        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        tv_text.setText(text);

    }
}