package com.example.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] countryNames;
    int[] flags={R.drawable.bangladesh,R.drawable.india,R.drawable.pakistan,R.drawable.srilanka,R.drawable.usa};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.ListViewId);
        // getiing strings value
        countryNames=  getResources().getStringArray(R.array.country_names);
        // creating custom adapter object
        CustomAdapter adapter= new CustomAdapter(this,countryNames,flags);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value= countryNames[position];
                Toast.makeText(MainActivity.this,value, Toast.LENGTH_LONG).show();
            }
        });

    }
}