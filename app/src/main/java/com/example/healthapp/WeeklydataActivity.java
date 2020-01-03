package com.example.healthapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class WeeklydataActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weeklydata);
    }

    public static final int weeklydataok =0;

    public void summaryokAction(View v){
        Intent intent = new Intent(this,HistoryActivity.class);
        startActivityForResult(intent,weeklydataok);
    }

}


