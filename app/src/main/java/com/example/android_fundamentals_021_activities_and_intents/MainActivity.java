package com.example.android_fundamentals_021_activities_and_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void goToText(View view) {

        switch (view.getId())
        {
            case R.id.btn_text1:
                openNewActivity(this, ActText1.class);
                break;

        }
    }

    public void openNewActivity(Context ct, Class <?> act){

        Intent intent = new Intent(ct, act);
        startActivity(intent);

    }
}