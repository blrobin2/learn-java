package com.blrobin2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Saveable saveable = new Monster();
        ArrayList<String> externalData = new ArrayList<>();
        externalData.add("One");
        externalData.add("Two");
        externalData.add("Three");
        saveable.set(externalData);
        System.out.println(saveable.get());

        System.out.println(saveable.toString());

        saveable = new Hero();
        ArrayList<Integer> otherExternalData = new ArrayList<>();
        otherExternalData.add(1);
        otherExternalData.add(2);
        otherExternalData.add(3);
        saveable.set(otherExternalData);
        System.out.println(saveable.get());

        System.out.println(saveable.toString());
    }
}
