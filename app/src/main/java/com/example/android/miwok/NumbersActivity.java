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
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create and array list of the english numbers
        ArrayList<String> numbersEnglish = new ArrayList<String>();
        numbersEnglish.add("One");
        numbersEnglish.add("Two");
        numbersEnglish.add("Three");
        numbersEnglish.add("Four");
        numbersEnglish.add("Five");
        numbersEnglish.add("Six");
        numbersEnglish.add("Seven");
        numbersEnglish.add("Eight");
        numbersEnglish.add("Nine");
        numbersEnglish.add("Ten");

        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        // Creates a text view for each word in the numbersEnglish arrayList
        for (int i = 0; i < numbersEnglish.size(); i++) {
            TextView txt = new TextView(this);
            txt.setId(i);
            txt.setText(numbersEnglish.get(i));
            rootView.addView(txt);
        }
    }
}
