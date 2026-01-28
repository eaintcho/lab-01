package com.example.petshop;

import java.util.Date;

public class HappyMood extends Mood {

    public HappyMood() {
        super(); // calls Mood()
    }

    public HappyMood(Date date) {
        super(date); // calls Mood(Date)
    }

    @Override
    public String getMoodString() {
        return "happy";
    }
}
