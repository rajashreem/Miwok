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

        numbersList.add(new Word("One", "Lutti", R.drawable.number_one));
        numbersList.add(new Word("Two", "Otiiko", R.drawable.number_two));
        numbersList.add(new Word("Three", "Tolookosu", R.drawable.number_three));
        numbersList.add(new Word("Four", "Oyyisa", R.drawable.number_four));
        numbersList.add(new Word("Five", "Massaokka", R.drawable.number_five));
        numbersList.add(new Word("Six", "Temmokka", R.drawable.number_six));
        numbersList.add(new Word("Seven", "kenekaku", R.drawable.number_seven));
        numbersList.add(new Word("Eight", "Kawinta", R.drawable.number_eight));
        numbersList.add(new Word("Nine", "Wo'e", R.drawable.number_nine));
        numbersList.add(new Word("Ten", "Na'aacha", R.drawable.number_ten));

        WordAdapter wordAdapater = new WordAdapter(this, numbersList);
        ListView listView = (ListView) findViewById(R.id.word_list_view);
        listView.setAdapter(wordAdapater);
    }
}
