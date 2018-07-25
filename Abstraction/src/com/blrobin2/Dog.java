package com.blrobin2;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }
}
