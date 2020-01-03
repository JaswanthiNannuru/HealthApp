package com.example.healthapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HistoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }
    public static final int weeklydata = 0;

    public void weeklydataokAction(View v){
        Intent intent = new Intent(this,WeeklydataActivity.class);
        startActivityForResult(intent,weeklydata);

    }
}
