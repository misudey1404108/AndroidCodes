package com.example.alertdialogue;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private AlertDialog.Builder alertdialoguebuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.ButtonId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertdialoguebuilder= new AlertDialog.Builder(MainActivity.this);
                alertdialoguebuilder.setTitle(R.string.Title);
                alertdialoguebuilder.setMessage(R.string.Message);

                // bu default eita true thake, that means alert dialog er baire kothao click korle sathe sathe cole jai
                alertdialoguebuilder.setCancelable(false);

                alertdialoguebuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // exit from the application
                        finish();

                    }
                });
                alertdialoguebuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // cancel the alert dialog
                        dialog.cancel();

                    }
                });
                alertdialoguebuilder.setNeutralButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // cancel the alert dialog
                        dialog.cancel();

                    }
                });

                // for showing the alert dialogue
                AlertDialog alertDialog= alertdialoguebuilder.create();
                alertDialog.show();


            }

        });
    }
}