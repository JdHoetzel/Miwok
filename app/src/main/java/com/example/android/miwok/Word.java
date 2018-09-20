package com.example.android.miwok;

/**
 * {@link Word} reperesents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation ofr that word.
 */
public class Word {

    /** Default translation for the work*/
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwakTranslaiton;

    /** Declation method Word takes 2 string variables*/
    public Word(String defaultTranslation, String miwakTranslaiton){
        mDefaultTranslation = defaultTranslation;
        mMiwakTranslaiton = miwakTranslaiton;
    }
    /** method to retrieve the default translation*/
    public String getDefautTranslation(){
        return mDefaultTranslation;
    }

    /** method to retrieve the miwak translation*/
    public String getMiwakTranslation(){
        return mMiwakTranslaiton;
    }
}
