package com.blrobin2;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();

    void addContact(String name, String phone) {
        contacts.add(new Contact(name, phone));
    }

    Contact getContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return contacts.get(position);
        }

        return null;
    }

    void editContact(String existingName, String newName, String newPhone) {
        int existingPosition = findContact(existingName);
        if (existingPosition >= 0) {
            contacts.set(existingPosition, new Contact(newName, newPhone));
        }
    }

    void removeContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            contacts.remove(position);
        }
    }

    public String toString() {

        if (contacts.size() == 0) {
            return "No contacts yet.";
        }

        StringBuilder string = new StringBuilder();

        for (int i = 0; i < contacts.size(); i++) {
            Contact c = contacts.get(i);
            string.append("\n ")
                    .append(i+1)
                    .append(". Name: ")
                    .append(c.getName())
                    .append("\t Phone: ")
                    .append(c.getPhoneNumber());
        }
        return string.toString();
    }

    boolean hasContact(String name) {
        return findContact(name) >= 0;
    }

    private int findContact(String name) {
        for (Contact c : contacts) {
            if (c.getName().equals(name)) {
                return contacts.indexOf(c);
            }
        }

        return -1;
    }
}
