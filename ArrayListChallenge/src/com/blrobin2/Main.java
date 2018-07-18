package com.blrobin2;

import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();
    private enum MobilePhoneOptions {
        PRINT_INSTRUCTIONS,
        PRINT_CONTACTS,
        ADD_CONTACT,
        MODIFY_CONTACT,
        REMOVE_CONTACT,
        SEARCH_FOR_CONTACT,
        QUIT,
    }

    public static void main(String[] args) {
        int choice = 0;
        startPhone();
        printActions();
        while (MobilePhoneOptions.values()[choice] != MobilePhoneOptions.QUIT) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (MobilePhoneOptions.values()[choice]) {
                case PRINT_INSTRUCTIONS:
                    printActions();
                    break;
                case PRINT_CONTACTS:
                    printContacts();
                    break;
                case ADD_CONTACT:
                    addNewContact();
                    break;
                case MODIFY_CONTACT:
                    updateContact();
                    break;
                case REMOVE_CONTACT:
                    removeContact();
                    break;
                case SEARCH_FOR_CONTACT:
                    queryContact();
                    break;
                case QUIT:
                    System.out.println("\nShutting down...");
                    break;
            }
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\n Press ");
        System.out.println("\t " + getOptionIndex(MobilePhoneOptions.PRINT_INSTRUCTIONS) + " - To print choice options.");
        System.out.println("\t " + getOptionIndex(MobilePhoneOptions.PRINT_CONTACTS) + " - To print list of contacts.");
        System.out.println("\t " + getOptionIndex(MobilePhoneOptions.ADD_CONTACT) + " - To add a contact to the phone.");
        System.out.println("\t " + getOptionIndex(MobilePhoneOptions.MODIFY_CONTACT) + " - To modify a contact in the phone.");
        System.out.println("\t " + getOptionIndex(MobilePhoneOptions.REMOVE_CONTACT) + " - To remove a contact from the phone.");
        System.out.println("\t " + getOptionIndex(MobilePhoneOptions.SEARCH_FOR_CONTACT) + " - To find a contact in the phone.");
        System.out.println("\t " + getOptionIndex(MobilePhoneOptions.QUIT) + " - To quit the application.");
    }

    private static int getOptionIndex(MobilePhoneOptions option) {
        return MobilePhoneOptions.valueOf(option.toString()).ordinal();
    }

    private static void printContacts() {
        System.out.println("Contacts: ");
        System.out.println(mobilePhone.toString());
    }

    private static void addNewContact() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: Name= " + name + " Phone= " + phone);
        } else {
            System.out.println("Cannot add " + name + ": already on file");
        }
    }

    private static void updateContact() {
        System.out.print("Enter name of contact to modify: ");
        String existingName = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(existingName);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record.");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.print("Enter name of contact to remove: ");
        String existingName = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(existingName);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted.");
        } else {
            System.out.println("Error deleting contact.");
        }
    }

    private static void queryContact() {
        System.out.print("Enter name of contact to find: ");
        String existingName = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(existingName);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " Number: " + existingContactRecord.getPhoneNumber());
    }
}
