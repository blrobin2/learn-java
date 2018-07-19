package com.blrobin2;

import java.util.ArrayList;

class Bank {
    private ArrayList<Branch> branches = new ArrayList<>();

    private Bank() {}

    static Bank openBank() {
        return new Bank();
    }

    boolean addBranch(Branch branch) {
        if (hasBranch(branch)) {
            System.out.println("Branch already exists for bank.");
            return false;
        }
        branches.add(branch);
        return true;
    }

    boolean addCustomerToBranch(Customer customer, Branch branch) {
        if (!hasBranch(branch)) {
            System.out.println("Branch not a part of this bank.");
            return false;
        }
        return branch.addCustomer(customer);
    }

    boolean addTransactionToCustomer(double transaction, Customer customer) {
        for (Branch branch : branches) {
            if (branch.hasCustomer(customer)) {
                return branch.addTransactionToCustomer(transaction, customer);
            }
        }

        System.out.println(customer.getName() + " not a customer of this bank.");
        return false;
    }

    String printBank() {
        StringBuilder string = new StringBuilder();
        string.append("\n\n== Bank ==");
        for (Branch branch : branches) {
            string.append("\n").append(branch.printBranch());
        }

        return string.toString();
    }

    private boolean hasBranch(Branch branch) {
        return branches.indexOf(branch) >= 0;
    }
}
