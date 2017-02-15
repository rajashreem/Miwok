package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word>{
    private int backgroundColor;

    public WordAdapter(Context context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        backgroundColor = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word word = getItem(position);

        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTranslation.setText(word.getMiwokTranslation());

        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTranslation.setText(word.getDefaultTranslation());

        ImageView wordImage = (ImageView) listItemView.findViewById(R.id.word_image);
        wordImage.setImageResource(word.getImageResourceId());

        LinearLayout translations = (LinearLayout) listItemView.findViewById(R.id.translations);
        int color = ContextCompat.getColor(getContext(), backgroundColor);
        translations.setBackgroundColor(color);

        return listItemView;
    }
}
