package com.example.jsonparsing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    QueryUtils q;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.list);

        EarthquakeAdapter adapter = new EarthquakeAdapter(this, q.extractEarthquakes());

        listView.setAdapter(adapter);
    }
}