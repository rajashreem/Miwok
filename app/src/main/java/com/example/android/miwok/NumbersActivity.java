package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numbersList = new ArrayList<Word>();

        numbersList.add(new Word("One", "Lutti"));
        numbersList.add(new Word("Two", "Otiiko"));
        numbersList.add(new Word("Three", "Tolookosu"));
        numbersList.add(new Word("Four", "Oyyisa"));
        numbersList.add(new Word("Five", "Massaokka"));
        numbersList.add(new Word("Six", "Temmokka"));
        numbersList.add(new Word("Seven", "kenekaku"));
        numbersList.add(new Word("Eight", "Kawinta"));
        numbersList.add(new Word("Nine", "Wo'e"));
        numbersList.add(new Word("Ten", "Na'aacha"));

        WordAdapter wordAdapater = new WordAdapter(this, numbersList);
        ListView listView = (ListView) findViewById(R.id.word_list_view);
        listView.setAdapter(wordAdapater);
    }
}
