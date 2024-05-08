package org.meicode.layouts;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView citiesList;
    private Spinner studentSpiner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citiesList = findViewById(R.id.citiesList);
        studentSpiner = findViewById(R.id.studentsSpinner);

//        ArrayList<String> students = new ArrayList<>();
//        students.add("Meisam");
//        students.add("Brad");
//        students.add("Sarah");
//        students.add("Madeline");
//        students.add("Tom");
//
//        ArrayAdapter<String > studentsAdapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_spinner_dropdown_item,
//                students
//        );
//        studentSpiner.setAdapter(studentsAdapter);

        studentSpiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, studentSpiner.getSelectedItem().toString() + "selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

//       final  ArrayList<String> cities = new ArrayList<>();
//        cities.add("Zurich");
//        cities.add("New York");
//        cities.add("Berlin");
//        cities.add("Moscow");
//        cities.add("Madrid");
//
//        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_list_item_1,
//                cities
//        );
//
//
//        citiesList.setAdapter(citiesAdapter);

        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedCity = (String) parent.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, selectedCity + " selected", Toast.LENGTH_SHORT).show();
            }
        });

    }
}