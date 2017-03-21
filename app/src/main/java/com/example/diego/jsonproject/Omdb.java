package com.example.diego.jsonproject;

/**
 * Created by Lab. Desenvolvimento on 20/03/2017.
 */

public class Omdb {
    private String title;
    private int year;

    public Omdb(){

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
