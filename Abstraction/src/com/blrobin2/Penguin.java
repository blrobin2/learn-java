package com.blrobin2;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println("I'm not very good at that, I'm going for a swim instead");
    }
}
