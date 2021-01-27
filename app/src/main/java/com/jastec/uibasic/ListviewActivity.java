package com.jastec.uibasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity {


    private ListView citiesListView;
    private Spinner studentsSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);


        citiesListView = findViewById(R.id.citiesList);
        studentsSpinner = findViewById(R.id.studentsSpinner);

        // MEMO : Spinner is a dropdown menu

//        ArrayList<String> students = new ArrayList<>();
//        students.add("Nuttakorn");
//        students.add("Emma");
//        students.add("Godzilla");
//        students.add("Kong");
//        students.add("Khidora");
//
//        ArrayAdapter<String> studentsAdapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_spinner_dropdown_item,
//                students
//        );
//
//        studentsSpinner.setAdapter(studentsAdapter);
        
        studentsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(ListviewActivity.this, students.get(position), Toast.LENGTH_SHORT).show();
                Toast.makeText(ListviewActivity.this, studentsSpinner.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        

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