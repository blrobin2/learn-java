package com.blrobin2;

public class Main {

    public static void main(String[] args) {
        Animal yorkie = new Dog("Yorkie");
        yorkie.breathe();
        yorkie.eat();

        Bird australianRingneck = new Parrot("Australian Ringneck");
        australianRingneck.breathe();
        australianRingneck.eat();
        australianRingneck.fly();

        Bird emperor = new Penguin("Emperor");
        emperor.fly();
    }
}
