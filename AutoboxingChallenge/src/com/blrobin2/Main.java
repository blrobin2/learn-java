package com.blrobin2;

public class Main {

    public static void main(String[] args) {
        Bank bank1 = Bank.openBank();
        Bank bank2 = Bank.openBank();

        Branch branch1 = Branch.openBranch();
        Branch branch2 = Branch.openBranch();
        Branch branch3 = Branch.openBranch();

        addBranchToBank(branch1, bank1);
        addBranchToBank(branch2, bank2);
        addBranchToBank(branch3, bank2);

        addBranchToBank(branch1, bank1);

        Customer jeff = Customer.createCustomer("Jeff", 12.95);
        Customer carl = Customer.createCustomer("Carl", 1.00);
        Customer larry = Customer.createCustomer("Larry", 100.12);

        addCustomerToBranchAtBank(jeff, branch1, bank1);
        addCustomerToBranchAtBank(carl, branch2, bank2);
        addCustomerToBranchAtBank(larry, branch3, bank2);

        addCustomerToBranchAtBank(jeff, branch1, bank1);

        transferMoneyAtBank(12.10, jeff, bank1);
        transferMoneyAtBank(1.00, larry, bank1);

        printBank(bank1);
        printBank(bank2);
    }

    private static void addBranchToBank(Branch branch, Bank bank) {
        if (bank.addBranch(branch)) {
            System.out.println("Branch added to bank successfully.");
        } else {
            System.out.println("Failed to add branch to bank.");
        }
    }

    private static void addCustomerToBranchAtBank(Customer customer, Branch branch, Bank bank) {
        if (bank.addCustomerToBranch(customer, branch)) {
            System.out.println("Customer successfully added.");
        } else {
            System.out.println("Customer failed to be added to branch.");
        }
    }

    private static void transferMoneyAtBank(double transaction, Customer customer, Bank bank) {
        if (bank.addTransactionToCustomer(transaction, customer)) {
            System.out.println("Transaction successful.");
        } else {
            System.out.println("Transaction failed.");
        }
    }

    private static void printBank(Bank bank) {
        System.out.println(bank.printBank());
    }
}
