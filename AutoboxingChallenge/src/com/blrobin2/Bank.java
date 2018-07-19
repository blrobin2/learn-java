package com.blrobin2;

import java.util.ArrayList;

class Bank {
    private String name;
    private ArrayList<Branch> branches;

    Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }

        return false;
    }

    boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }

        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }

        return null;
    }

    boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) return false;
        System.out.println("Bank: " + name);
        System.out.println("Customer details for branch " + branch.getName());
        ArrayList<Customer> branchCustomers = branch.getCustomers();
        for (int i = 0; i < branchCustomers.size(); i++) {
            Customer branchCustomer = branchCustomers.get(i);
            System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
            if (showTransactions) {
                System.out.println("Transactions");
                ArrayList<Double> transactions = branchCustomer.getTransactions();
                for (int j = 0; j < transactions.size(); j++) {
                    System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                }
            }
        }

        return true;
    }
}
