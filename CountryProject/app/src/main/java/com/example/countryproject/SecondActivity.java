package com.example.countryproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView = (ImageView) findViewById(R.id.ImageViewId);
        textView = (TextView) findViewById(R.id.TextViewId);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String value = bundle.getString("Name");
            showdetails(value);
        }

    }

    void showdetails(String value) {
        if (value.equals("Bangladesh")) {
            imageView.setImageResource(R.drawable.bangladesh_1);
            textView.setText(R.string.Bangladesh_text);
        } else if (value.equals("India")) {
            imageView.setImageResource(R.drawable.india_1);
            textView.setText(R.string.India_text);
        } else if (value.equals("Pakistan")) {
            imageView.setImageResource(R.drawable.pakistan_1);
            textView.setText(R.string.Pakistan_text);
        }
    }

}