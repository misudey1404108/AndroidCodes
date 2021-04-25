package com.example.listview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    String[] countryNames;
    int[] flags;
    Context context;
    private LayoutInflater inflater; // xml file ke view te convert korte gele eita lage

    CustomAdapter(Context context, String[] countryNames, int[] flags) {
        this.context = context;
        this.countryNames = countryNames;
        this.flags = flags;

    }
    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null) {
            // LAYOUT_INFLATER_SERVICE needs for inflater
            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            // noe convertView contains text view
            convertView= inflater.inflate(R.layout.text, parent, false);

        }
        // finding imageView and textView by id
        ImageView imageView= (ImageView) convertView.findViewById(R.id.ImageViewId);
        TextView textView=(TextView) convertView.findViewById(R.id.CountryNameId);

        // settings imageView and textView
        imageView.setImageResource(flags[position]);
        textView.setText(countryNames[position]);

        // here convertView contains text view
        return convertView;
    }
}
