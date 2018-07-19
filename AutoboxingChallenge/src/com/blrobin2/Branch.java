package com.blrobin2;

import java.util.ArrayList;

class Branch {
    private String name;
    private ArrayList<Customer> customers;

    Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    String getName() {
        return name;
    }

    ArrayList<Customer> getCustomers() {
        return customers;
    }

    boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }

        return false;
    }

    boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }

        return null;
    }
}
