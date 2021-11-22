package com.example.lab2bweek3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);

        String[] values = new String[]{
                "ICT602",
                "FAIRUN NASUHA",
                "ANDROID STUDIO",
                "List Based Layout",
                "Android List View",
                "28/10/2021"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);
    }
}