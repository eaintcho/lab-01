package com.example.petshop;

import java.util.Date;

public class SadMood extends Mood {

    public SadMood() {
        super(); // sets date to now
    }

    public SadMood(Date date) {
        super(date); // sets date to the one provided
    }

    @Override
    public String getMoodString() {
        return "sad";
    }
}
