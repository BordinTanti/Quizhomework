package com.example.quizhomework.model;

public class WordItem {
    public final int imageResId;
    public final String engword;
    public final String thaiword;

    public WordItem(int imageResId, String engword,String thaiword) {
        this.imageResId = imageResId;
        this.engword = engword;
        this.thaiword = thaiword;
    }
}
