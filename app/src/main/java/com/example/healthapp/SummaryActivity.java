package com.example.healthapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SummaryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
    }

    public static final int summok =0;

    public void summaryokAction(View v){
        Intent intent = new Intent(this,MainPageActivity.class);
        startActivityForResult(intent,summok);

    }

}
