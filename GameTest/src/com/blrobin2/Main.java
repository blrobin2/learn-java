package com.blrobin2;

import com.example.game.Hero;
import com.example.game.Monster;
import com.example.game.Saveable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declaring as implementation
        Hero hero = new Hero("Carl", 10, 15);
        System.out.println(hero);
        saveObject(hero);

        hero.setHitPoints(8);
        System.out.println(hero);
        saveObject(hero);
        loadObject(hero);
        System.out.println(hero);

        // Declaring as interface
        Saveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println(((Monster) werewolf).getStrength());
        System.out.println(werewolf);
        saveObject(werewolf);
    }

    private static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit"
        );

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    private static void saveObject(Saveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    private static void loadObject(Saveable objectToLoad) {
        List<String> values = readValues();
        objectToLoad.read(values);
    }
}
