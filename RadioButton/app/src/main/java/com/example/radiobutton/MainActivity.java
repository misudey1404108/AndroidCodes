// The difference between Radio Button and checkbox is, in checkbox, you can select multiple items,
// but in radio button, you can select only one item

package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private RadioGroup radioGroup;
    private RadioButton gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.ButtonId);
        textView= (TextView) findViewById(R.id.TextviewID);
       radioGroup= (RadioGroup) findViewById(R.id.RadioGroupID);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value= new String();
                int selected= radioGroup.getCheckedRadioButtonId();
                gender= (RadioButton) findViewById(selected);
                value= gender.getText().toString();
                textView.setText("You selected : " + value);

            }
        });
    }
}