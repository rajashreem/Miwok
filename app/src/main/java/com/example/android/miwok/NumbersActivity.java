package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> numbersList = new ArrayList<String>();

        numbersList.add("One");
        numbersList.add("Two");
        numbersList.add("Three");
        numbersList.add("Four");
        numbersList.add("Five");
        numbersList.add("Six");
        numbersList.add("Seven");
        numbersList.add("Eight");
        numbersList.add("Nine");
        numbersList.add("Ten");

        ArrayAdapter<String> numbersAdapater = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbersList);
        ListView listView = (ListView) findViewById(R.id.numbers_list_view);
        listView.setAdapter(numbersAdapater);
    }
}
