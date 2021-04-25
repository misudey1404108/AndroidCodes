package com.example.listviewsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.ListViewId);
        searchView= (SearchView) findViewById(R.id.SearchViewId);
        // getiing strings value
        String [] countryNames=  getResources().getStringArray(R.array.country_names);
        // creating adapter
        ArrayAdapter<String> adapter = new ArrayAdapter(MainActivity.this, R.layout.text, R.id.TextViewId, countryNames);
        // set the adapter in ListView
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText); // newText er madomme filter kore filter result dekhabe
                return false;
            }
        });

        // this ItemClickListen will call when we select any item
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value= adapter.getItem(position); // evabe na korle and ArrayAdapter<String> adapter na korle error dekhabe
                Toast.makeText(MainActivity.this,value, Toast.LENGTH_LONG).show();

            }
        });
    }
}