package com.example.android_fundamentals_021_activities_and_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    final static String EXTRA_TEXT = "MainActivity.extras.text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void goToText(View view) {

        switch (view.getId()) {
            case R.id.btn_text1:
                openNewActivityWithNewText(this, ActText1.class, EXTRA_TEXT, getResources().getString(R.string.text1));
                break;

            case R.id.btn_text2:
                openNewActivityWithNewText(this, ActText1.class, EXTRA_TEXT, getResources().getString(R.string.text2));
                break;

            case R.id.btn_text3:
                openNewActivityWithNewText(this, ActText1.class, EXTRA_TEXT, getResources().getString(R.string.text3));
                break;
        }
    }

    public void openNewActivityWithNewText(Context ct, Class<?> act, String extraKey, String text) {

        Intent intent = new Intent(ct, act);
        intent.putExtra(extraKey, text);
        startActivity(intent);
    }
}