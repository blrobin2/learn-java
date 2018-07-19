package com.blrobin2;

import java.util.ArrayList;

class Customer {
    private String name;
    private ArrayList<Double> transactions;

    Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmount);
    }

    void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    String getName() {
        return name;
    }

    ArrayList<Double> getTransactions() {
        return transactions;
    }
}
