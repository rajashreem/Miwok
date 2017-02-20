package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> numbersList = new ArrayList<Word>();

        numbersList.add(new Word("One", "Lutti", R.drawable.number_one, R.raw.number_one));
        numbersList.add(new Word("Two", "Otiiko", R.drawable.number_two, R.raw.number_two));
        numbersList.add(new Word("Three", "Tolookosu", R.drawable.number_three, R.raw.number_three));
        numbersList.add(new Word("Four", "Oyyisa", R.drawable.number_four, R.raw.number_four));
        numbersList.add(new Word("Five", "Massaokka", R.drawable.number_five, R.raw.number_five));
        numbersList.add(new Word("Six", "Temmokka", R.drawable.number_six, R.raw.number_six));
        numbersList.add(new Word("Seven", "Kenekaku", R.drawable.number_seven, R.raw.number_seven));
        numbersList.add(new Word("Eight", "Kawinta", R.drawable.number_eight, R.raw.number_eight));
        numbersList.add(new Word("Nine", "Wo'e", R.drawable.number_nine, R.raw.number_nine));
        numbersList.add(new Word("Ten", "Na'aacha", R.drawable.number_ten, R.raw.number_ten));

        WordAdapter wordAdapater = new WordAdapter(this, numbersList, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.word_list_view);
        listView.setAdapter(wordAdapater);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                MediaPlayer mediaPlayer = MediaPlayer.create(view.getContext(), numbersList.get(position).getPronunciation());
                mediaPlayer.start();
            }
        });
    }
}
