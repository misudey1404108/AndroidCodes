package com.example.button2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// For multibutton purpose, we will set only one click listener

/*
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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
        contactsbutton.setOnClickListener(this);
        // To exit from an android app
        exitButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.contactsbuttonid) {
            count++;
            textView.setText("Contacts Button is pressed "+count+" times");
        }
        else {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }
    }
}

 */

// We will try to handle on click listener function uaing an class
public class MainActivity extends AppCompatActivity {

    int count = 0;
    private Button contactsbutton;
    private Button exitButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactsbutton = (Button) findViewById(R.id.contactsbuttonid);
        textView = (TextView) findViewById(R.id.textViewid);
        exitButton = (Button) findViewById(R.id.exitbuttonid);

        //using inner class

        Handler handler = new Handler();
        // adding click listener function in contacts button
        contactsbutton.setOnClickListener(handler);
        // To exit from an android app
        exitButton.setOnClickListener(handler);

    }

    class Handler implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.contactsbuttonid) {
                count++;
                textView.setText("Contacts Button is pressed "+count+" times");
            } else {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        }
    }
}



