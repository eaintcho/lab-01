package com.example.petshop;

public class Dog extends Pet implements Pettable{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void pet() {
        System.out.println("The dog wags its tail");
    }


    @Override
    public String speak() {
        return "bark";
    }
}
