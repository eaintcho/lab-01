package com.example.petshop;

public class Cat extends Pet implements Pettable{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void pet() {
        System.out.println("The cat purrs");
    }


    @Override
    public String speak() {
        return "meow";
    }
}
