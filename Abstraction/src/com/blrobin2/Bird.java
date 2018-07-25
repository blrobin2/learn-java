package com.blrobin2;

abstract class Bird extends Animal {
    Bird(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

    abstract void fly();
}
