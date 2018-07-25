package com.blrobin2;

abstract class Bird extends Animal implements CanFly {
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

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
