package com.example.android.miwok;

public class Word {
    private static final int NO_IMAGE = -1;

    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceId = NO_IMAGE;

    public Word(String defaultWord, String miwokWord){
        defaultTranslation = defaultWord;
        miwokTranslation = miwokWord;
    }

    public Word(String defaultWord, String miwokWord, int imageResource){
        defaultTranslation = defaultWord;
        miwokTranslation = miwokWord;
        imageResourceId = imageResource;
    }

    public String getDefaultTranslation(){
        return defaultTranslation;
    }

    public String getMiwokTranslation(){
        return miwokTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage(){
        return imageResourceId != NO_IMAGE;
    }
}
