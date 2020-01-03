package com.example.healthapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
    }
    public static final int viewgroup =  0;
    public static final int submitaction =  0;
    public static final int history =  0;

        public void viewGroup(View v){
        Intent intent = new Intent(this,GroupActivity.class);
        startActivityForResult(intent,viewgroup);
    }

    public void submitAction(View v){
        Intent intent = new Intent(this,SummaryActivity.class);
        startActivityForResult(intent,submitaction);
    }

    public void historyView(View v){
        Intent intent = new Intent(this,HistoryActivity.class);
        startActivityForResult(intent,history);
    }


}
