package com.blrobin2;

abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();
    abstract void breathe();

    String getName() {
        return name;
    }
}
