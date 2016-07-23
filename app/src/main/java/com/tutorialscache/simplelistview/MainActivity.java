package com.tutorialscache.simplelistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simplelistview;
    // Create a countries array
    String[] countries = new String[]{"Japan","Italy","France","England","Brazil","Canada","Egypt","Hong Kong","Kuwait","Malaysia","Mexico","New Zealand","Pakistan","Turkey"};

    // Create an adapter, which will be later used to display countries on listview
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Getting reference to listview
        simplelistview = (ListView) findViewById(R.id.simplelistview);

        //Creating adapter object to pass countries array to adapter
        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,countries);

        //Setting Adapter on listview to render countries
        simplelistview.setAdapter(arrayAdapter);
    }
}
