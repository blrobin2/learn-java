package com.blrobin2;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private List<Contact> contacts;

    MobilePhone() {
        this.contacts = new ArrayList<>();
    }

    boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            return false;
        }

        contacts.add(contact);
        return true;
    }
    
    boolean updateContact(Contact oldContact, Contact newContact) {
        int existingPosition = findContact(oldContact);
        if (existingPosition < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() + " already exists. Update was not successful.");
            return false;
        }

        contacts.set(existingPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return contacts.get(position);
        }

        return null;
    }

    boolean removeContact(Contact contact) {
        int existingPosition = findContact(contact);
        if (existingPosition < 0) {
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        contacts.remove(contact);
        System.out.println(contact.getName() + " was removed");
        return true;
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

    private int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
}
