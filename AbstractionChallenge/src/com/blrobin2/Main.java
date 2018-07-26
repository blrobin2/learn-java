package com.blrobin2;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(null);
        list.traverse(list.getRoot());
        String stringData = "5 7 3 9 8 2 1 0 4 6";
        for (String s : stringData.split(" ")) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("5"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("0"));
        list.removeItem(new Node("4"));
        list.removeItem(new Node("2"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("9"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("8"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("6"));
        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());
        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());
    }
}
