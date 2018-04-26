package com.example.jonmid.practicaborder.Models;

public class Food {
    public Food() {

    }

    public String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        this.title = title;
    }

    public Food(String title) {

        this.title = title;
    }

    private String title;

}
