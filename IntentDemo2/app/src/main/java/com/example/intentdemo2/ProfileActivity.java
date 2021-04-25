package com.example.intentdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProfileActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Bundle bundle= getIntent().getExtras();
        textView= (TextView) findViewById(R.id.textviewid);
        if(bundle!=null) {
            String value= bundle.getString("tag");
            textView.setText(value);

        }
    }
}