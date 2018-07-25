package com.blrobin2;

public class Penguin extends Bird {
    Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not very good at that, I'm going for a swim instead");
    }
}
