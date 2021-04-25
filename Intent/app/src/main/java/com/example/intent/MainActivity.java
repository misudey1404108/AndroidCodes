package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

// must use import android.content.Intent; otherwise build error
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button contactsbutton;
    private Button exitButton;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactsbutton=(Button) findViewById(R.id.contactsbuttonid);
        textView=(TextView) findViewById(R.id.textViewid);
        exitButton=(Button) findViewById(R.id.exitbuttonid);
        // adding click listener function in contacts button
        contactsbutton.setOnClickListener(this);
        // To exit from an android app
        exitButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.contactsbuttonid) {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }
        else {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }
    }
}
