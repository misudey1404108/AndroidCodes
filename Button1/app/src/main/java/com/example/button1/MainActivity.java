package com.example.button1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.UiAutomation;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count=0;
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
        contactsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textView.setText("Contacts Button is pressed "+count+" times");
            }
        });
        // To exit from an android app
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

    }
}