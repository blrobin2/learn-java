package com.blrobin2;

public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
