package com.marcoslopez7.interactivestory.Models;

/**
 * Created by marcoslopez7 on 15/04/16.
 */
public class Choice {
    private String text;
    private int nextPage;

    public Choice(String t, int np){
        this.text = t;
        this.nextPage = np;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
