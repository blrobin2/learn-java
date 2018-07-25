package com.blrobin2;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Jeff");
        list.add("Carl");
        list.add("Abraham");
        list.add("Ben");
        list.add("Zeke");

        ListItem next = list.next();
        while (next != null) {
            System.out.println(next.value());
            next = next.next();
        }
    }
}
