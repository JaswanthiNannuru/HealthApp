package com.example.healthapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public static final int signup1 = 0;
    public void signupbtnAction(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivityForResult(intent,signup1);

 }
}
