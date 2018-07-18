package com.blrobin2;

class Contact {
    private String name;
    private String phoneNumber;

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    String getName() {
        return name;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }
}
