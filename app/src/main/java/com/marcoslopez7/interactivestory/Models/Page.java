package com.marcoslopez7.interactivestory.Models;

import com.marcoslopez7.interactivestory.R;

/**
 * Created by marcoslopez7 on 15/04/16.
 */
public class Page {
    private int imageId;
    private String text;
    private Choice choice1;
    private Choice choice2;
    private boolean isFinal = false;

    public boolean isFinal() {
        return isFinal;
    }

    public void setIsFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    public Page(int id, String t, Choice c1, Choice c2){
        this.imageId = id;
        this.text = t;
        this.choice1 = c1;
        this.choice2 = c2;
    }

    public Page(int id, String t){
        this.imageId = id;
        this.text = t;
        this.choice1 = null;
        this.choice2 = null;
        isFinal = true;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Choice getChoice1() {
        return choice1;
    }

    public void setChoice1(Choice choice1) {
        this.choice1 = choice1;
    }

    public Choice getChoice2() {
        return choice2;
    }

    public void setChoice2(Choice choice2) {
        this.choice2 = choice2;
    }
}
