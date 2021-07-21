package com.example.jsonparsing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private QueryUtils q;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.list);
        ArrayList<Earthquake> earthquakes = q.extractEarthquakes();

       final EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        listView.setAdapter(adapter);

        //setOnItemClickListener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Find the current earthquake listItem which was clicked on
                Earthquake currentEarthquake = adapter.getItem(position);
                Uri earthquakeUri =  Uri.parse(currentEarthquake.getmUrl());

                //Setting websiteIntent
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW,earthquakeUri);
                //send the intent to launch a new activity
                startActivity(websiteIntent);
            }
        });
    }
}