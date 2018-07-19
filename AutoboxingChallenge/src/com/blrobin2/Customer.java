package com.blrobin2;

import java.util.ArrayList;

class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    private Customer(String name, double initialTransaction) {
        this.name = name;
        transactions.add(initialTransaction);
    }

    static Customer createCustomer(String name, double initialTransaction) {
        return new Customer(name, initialTransaction);
    }

    String getName() {
        return name;
    }

    void addTransaction(double transaction) {
        transactions.add(transaction);
        System.out.println(transaction + " added to " + name + "'s account.");
    }

    String printCustomer() {
        StringBuilder string = new StringBuilder();
        string
            .append("Name: ")
            .append(name);

        for (double transaction : transactions) {
            string.append("\n\t * ").append(transaction);
        }

        return string.toString();
    }
}
