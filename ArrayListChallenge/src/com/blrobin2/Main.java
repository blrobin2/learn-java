package com.blrobin2;

import java.util.Scanner;


public class Main {
    private static Scanner s = new Scanner(System.in);
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
        printInstructions();
        while (MobilePhoneOptions.values()[choice] != MobilePhoneOptions.QUIT) {
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            switch (MobilePhoneOptions.values()[choice]) {
                case PRINT_INSTRUCTIONS:
                    printInstructions();
                    break;
                case PRINT_CONTACTS:
                    printContacts();
                    break;
                case ADD_CONTACT:
                    addContact();
                    break;
                case MODIFY_CONTACT:
                    modifyContact();
                    break;
                case REMOVE_CONTACT:
                    removeContact();
                    break;
                case SEARCH_FOR_CONTACT:
                    searchForContact();
            }
        }
    }

    private static void printInstructions() {
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
        System.out.println(mobilePhone.toString());
    }

    private static void addContact() {
        System.out.print("Enter name: ");
        s.nextLine();
        String name = s.nextLine();
        System.out.print("Enter phone: ");
        String phone = s.nextLine();
        mobilePhone.addContact(name, phone);
    }

    private static void modifyContact() {
        System.out.print("Enter name of contact to modify: ");
        s.nextLine();
        String existingName = s.nextLine();

        if (mobilePhone.hasContact(existingName)) {
            System.out.println("Enter new name: ");
            String newName = s.nextLine();
            System.out.println("Enter new phone: ");
            String newPhone = s.nextLine();
            mobilePhone.editContact(existingName, newName, newPhone);
        } else {
            System.out.println("Contact " + existingName + " is not in phone.");
        }


    }

    private static void removeContact() {
        System.out.println("Enter name of contact to remove: ");
        s.nextLine();
        String name = s.nextLine();
        mobilePhone.removeContact(name);
    }

    private static void searchForContact() {
        System.out.print("Enter name of contact to find: ");
        s.nextLine();
        String name = s.nextLine();
        if (mobilePhone.hasContact(name)) {
            System.out.println("Contact " + name + " is in phone.");
        } else {
            System.out.println("Contact " + name + " IS NOT in the phone.");
        }
    }
}
