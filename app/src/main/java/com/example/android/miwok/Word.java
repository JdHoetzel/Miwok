package com.example.android.miwok;

import android.content.Context;

/**
 * {@link Word} reperesents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation ofr that word.
 */
public class Word {

    /** Default translation for the word*/
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslaiton;

    /** Declaration method Word takes 2 string variables (Constructor)*/
    public Word(String defaultTranslation, String miwakTranslaiton){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslaiton = miwakTranslaiton;
    }
    /** method to retrieve the default translation*/
    public String getDefautTranslation(){
        return mDefaultTranslation;
    }

    /** method to retrieve the miwak translation*/
    public String getMiwokTranslation(){
        return mMiwokTranslaiton;
    }

}
