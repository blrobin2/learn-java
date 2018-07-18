package com.blrobin2;

import java.util.ArrayList;

class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    ArrayList<String> getGroceryList() {
        return groceryList;
    }

    void addGroceryItem(String item) {
        groceryList.add(item);
    }

    void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    boolean onFile(String item) {
        return findItem(item) >= 0;
    }
}
