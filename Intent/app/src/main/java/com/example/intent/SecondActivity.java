package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private Button backbutton;
    private Button PhoneNoButton1, PhoneNoButton2, PhoneNoButton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        PhoneNoButton1=(Button) findViewById(R.id.PhoneNumberButtonID);
        PhoneNoButton1.setOnClickListener(this);
        PhoneNoButton2=(Button) findViewById(R.id.PhoneNumberButtonID1);
        PhoneNoButton2.setOnClickListener(this);
        PhoneNoButton3=(Button) findViewById(R.id.PhoneNumberButtonID2);
        PhoneNoButton3.setOnClickListener(this);
        backbutton=(Button) findViewById(R.id.BackButtonId);
        backbutton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.BackButtonId) {
            Intent intent = new Intent(SecondActivity.this,MainActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.PhoneNumberButtonID) {
            Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.PhoneNumberButtonID1) {
            Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.PhoneNumberButtonID2) {
            Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
            startActivity(intent);
        }
    }
}