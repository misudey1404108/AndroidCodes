package com.example.listview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import static com.example.listview1.R.id.ListViewId;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(ListViewId);

        // getiing strings value
        String [] countryNames=  getResources().getStringArray(R.array.country_names);
        // creating adapter
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, R.layout.text, R.id.TextViewId, countryNames);
        // set the adapter in ListView
        listView.setAdapter(adapter);

        // this ItemClickListen will call when we select any item
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value= countryNames[position];
                Toast.makeText(MainActivity.this,value, Toast.LENGTH_LONG).show();

            }
        });
    }
}