package com.blrobin2;

import java.util.ArrayList;

class Branch {
    private ArrayList<Customer> customers = new ArrayList<>();

    private Branch() {}

    static Branch openBranch() {
        return new Branch();
    }

    boolean addCustomer(Customer customer) {
        if (hasCustomer(customer)) {
            System.out.println("Customer already exists.");
            return false;
        }

        customers.add(customer);
        System.out.println("Customer " + customer.getName() + " added.");
        return true;
    }

    boolean addTransactionToCustomer(double transaction, Customer customer) {
        if (!hasCustomer(customer)) {
            System.out.println(customer.getName() + " is not a customer at this branch.");
            return false;
        }
        customer.addTransaction(transaction);
        return true;
    }

    boolean hasCustomer(Customer customer) {
        return customers.indexOf(customer) >= 0;
    }

    String printBranch() {
        StringBuilder string = new StringBuilder();
        string.append("Branch: ");
        for (Customer customer : customers) {
            string.append("\n - ").append(customer.printCustomer());
        }

        return string.toString();
    }
}
