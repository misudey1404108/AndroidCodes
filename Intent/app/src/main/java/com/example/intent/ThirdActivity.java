package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    private Button BackButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        BackButton2 =(Button) findViewById(R.id.BackButton2ID);
        BackButton2.setOnClickListener(this);

    }
    public void onClick(View v) {
        if(v.getId()==R.id.BackButton2ID) {
            Intent intent = new Intent(ThirdActivity.this,SecondActivity.class);
            startActivity(intent);
        }
    }
}