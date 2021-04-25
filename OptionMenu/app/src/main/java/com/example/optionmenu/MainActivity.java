package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // menuinflater service er sahojje menu_xml file ke java file e convert korbo
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // Menu er click listener onOptionsItemSelected
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.Settingid) {

            Toast.makeText(this,"Settings is selected", Toast.LENGTH_SHORT). show();
        }
        else if(item.getItemId()==R.id.Shareid) {

            Toast.makeText(this,"Share is selected", Toast.LENGTH_SHORT). show();
        }
        else if(item.getItemId()==R.id.feedbackid) {

            Toast.makeText(this,"Feedback is selected", Toast.LENGTH_SHORT). show();
        }
        else if(item.getItemId()==R.id.Helpid) {

            Toast.makeText(this,"Help is selected", Toast.LENGTH_SHORT). show();
        }
        return super.onOptionsItemSelected(item);
    }
}