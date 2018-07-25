package com.blrobin2;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        for (String s : stringData.split(" ")) {
            if (list.add(s)) {
                System.out.println("Added new item " + s);
            } else {
                System.out.println("Duplicate item " + s + " discarded");
            }
        }

        System.out.println("==================");

        ListItem next = list.next();
        while (next != null) {
            System.out.println(next.value());
            next = next.next();
        }
    }
}
