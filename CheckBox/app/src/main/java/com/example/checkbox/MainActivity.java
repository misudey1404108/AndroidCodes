package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import static com.example.checkbox.R.id.MilkID;

public class MainActivity extends AppCompatActivity {


    private Button button;
    private CheckBox milkbox, sugarbox, waterbox;
    private TextView resulttextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        milkbox= (CheckBox) findViewById(R.id.MilkID);
        waterbox= (CheckBox) findViewById(R.id.SugarID);
        sugarbox= (CheckBox) findViewById(R.id.WaterID);

        button= (Button) findViewById(R.id.ButtonID);

        resulttextview= (TextView) findViewById(R.id.ResultID);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // StringBuilder class er sahojje onekgula string store kore rakha jai
                StringBuilder stringBuilder= new StringBuilder();
                if(milkbox.isChecked()) {
                    String value= milkbox.getText().toString();
                    stringBuilder.append(value+" is ordered\n");

                }
                if(sugarbox.isChecked()) {
                    String value= sugarbox.getText().toString();
                    stringBuilder.append(value+" is ordered\n");

                }
                if(waterbox.isChecked()) {
                    String value= waterbox.getText().toString();
                    stringBuilder.append(value+" is ordered\n");

                }
                resulttextview.setText(stringBuilder);
            }
        });




    }
}