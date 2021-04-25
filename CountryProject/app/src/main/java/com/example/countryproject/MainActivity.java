package com.example.countryproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Bbutton, Ibutton, Pbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bbutton = (Button) findViewById(R.id.BangladeshId);
        Ibutton = (Button) findViewById(R.id.IndiaId);
        Pbutton = (Button) findViewById(R.id.PakistanId);

        Bbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Name", "Bangladesh");
                startActivity(intent);

            }
        });
        Ibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Name", "India");
                startActivity(intent);
            }
        });
        Pbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Name", "Pakistan");
                startActivity(intent);
            }
        });

    }

    // creating an alert dialogue if user tried to exit from application
    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertdialoguebuilder = new AlertDialog.Builder(MainActivity.this);
        alertdialoguebuilder.setIcon(R.drawable.question);
        alertdialoguebuilder.setTitle("Alert Message!");
        alertdialoguebuilder.setMessage("Do you want to exit? ");
        alertdialoguebuilder.setCancelable(false);

        alertdialoguebuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertdialoguebuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog= alertdialoguebuilder.create();
        alertDialog.show();


    }
}