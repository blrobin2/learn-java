package com.blrobin2;

public class Main {
    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());
        String stringData = "5 7 3 9 8 2 1 0 4 6";
        for (String s : stringData.split(" ")) {
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());

//        tree.traverse(tree.getRoot());
//        tree.removeItem(new Node("3"));
//        tree.traverse(tree.getRoot());
//
//        tree.removeItem(new Node("5"));
//        tree.traverse(tree.getRoot());
//
//        tree.removeItem(new Node("0"));
//        tree.removeItem(new Node("4"));
//        tree.removeItem(new Node("2"));
//        tree.traverse(tree.getRoot());
//
//        tree.removeItem(new Node("9"));
//        tree.traverse(tree.getRoot());
//        tree.removeItem(new Node("8"));
//        tree.traverse(tree.getRoot());
//        tree.removeItem(new Node("6"));
//        tree.removeItem(tree.getRoot());
//        tree.traverse(tree.getRoot());
//        tree.removeItem(tree.getRoot());
//        tree.traverse(tree.getRoot());
    }
}
