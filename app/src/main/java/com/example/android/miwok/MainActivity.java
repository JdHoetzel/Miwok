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

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
    }
    // Change activity view to Numbers activity
    public void gotoNumbersActivity (View view){
        Intent numbersView = new Intent(this, NumbersActivity.class);
        startActivity(numbersView);
    }
    // Change activity view to Colors activity
    public void gotoColorsActivity (View view){
        Intent numbersView = new Intent(this, ColorsActivity.class);
        startActivity(numbersView);
    }
    // Change activity view to Family activity
    public void gotoFamilyActivity (View view){
        Intent numbersView = new Intent(this, FamilyActivity.class);
        startActivity(numbersView);
    }
    // Change activity view to Phrases activity
    public void gotoPhrasesActivity (View view){
        Intent numbersView = new Intent(this, PhrasesActivity.class);
        startActivity(numbersView);
    }

}
