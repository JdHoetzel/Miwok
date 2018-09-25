package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {




    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listView = convertView;
        if(listView==null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord = getItem(position);

        TextView defaultTextView = (TextView) listView.findViewById(R.id.textViewE1);
        defaultTextView.setText(currentWord.getDefautTranslation());

        TextView miwokTextView = (TextView) listView.findViewById(R.id.textViewM1);
        miwokTextView.setText(currentWord.getMiwokTranslation());

    return listView;
    }

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<Word> myWords){
        super(context, 0, myWords);
    }

}
