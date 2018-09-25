/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create and array list of the Word class number pairs
        ArrayList<Word> numbersEnglish = new ArrayList<Word>();
        numbersEnglish.add(new Word("one", "lutti"));
        numbersEnglish.add(new Word("two", "otiiko"));
        numbersEnglish.add(new Word("three", "toloookosu"));
        numbersEnglish.add(new Word("four", "oyyisa"));
        numbersEnglish.add(new Word("five", "massokka"));
        numbersEnglish.add(new Word("six", "temmokka"));
        numbersEnglish.add(new Word("seven", "kenekaku"));
        numbersEnglish.add(new Word("eight", "kawinta"));
        numbersEnglish.add(new Word("nine", "wo'e"));
        numbersEnglish.add(new Word("ten", "na'aacha"));

        WordAdapter itemsAdapter = new WordAdapter(this, numbersEnglish);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);



    }
}
