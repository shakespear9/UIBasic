package com.jastec.uibasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity {


    private ListView citiesListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);


        citiesListView = findViewById(R.id.citiesList);
        // MEMO 1 : ListView is a one of the options to show diffence options

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Bangkok");
        cities.add("Seoul");
        cities.add("Paris");
        cities.add("New York");
        cities.add("Barca");

        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, //MEMO : ArrayAdapter need to use layout to bind and design list สามารถใช้ custom layout เพื่อตกแต่งให้กับ ListItem ได้
                cities
        );
        //MEMO 2 : Create Adapter to fetch the data to ListView


        citiesListView.setAdapter(citiesAdapter);

        citiesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListviewActivity.this, cities.get(position), Toast.LENGTH_SHORT).show();
            }
        });








    }
}