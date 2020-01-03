package com.example.healthapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class GroupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
    }

    public static final int Ok = 0;

    public void groupokAction(View v){
        Intent intent = new Intent(this,MainPageActivity.class);
        startActivityForResult(intent,Ok);
    }
}
