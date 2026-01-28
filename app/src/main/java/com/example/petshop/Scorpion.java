package com.example.petshop;

public class Scorpion extends Pet {

    public Scorpion(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "hiss";
    }
}

