package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static final int Login =  0;
    public static final int Signup =  0;

    public void loginAction(View v){
        Intent intent = new Intent(this,MainPageActivity.class);
        startActivityForResult(intent,Login);
    }
    public void signupAction(View v){
        Intent intent = new Intent(this,SignupActivity.class);
        startActivityForResult(intent,Signup);
    }
}
