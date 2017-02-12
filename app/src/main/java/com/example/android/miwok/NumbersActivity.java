package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

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

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootview);

        for(int i=0 ; i < numbersList.size(); i++){
            TextView textView = new TextView(this);
            textView.setText(numbersList.get(i));
            rootView.addView(textView);
        }

    }
}
