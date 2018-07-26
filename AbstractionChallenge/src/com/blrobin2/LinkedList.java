package com.blrobin2;

public class LinkedList implements NodeList {
    private ListItem root = null;

    public LinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            // Empty list, this is first item
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                // newItem is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at end
                    currentItem
                            .setNext(newItem) // returns newItem
                            .setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, insert before
                if (currentItem.previous() != null) {
                    currentItem.previous()
                            .setNext(newItem)
                            .setPrevious(currentItem.previous());
                    newItem
                            .setNext(currentItem)
                            .setPrevious(newItem);
                } else {
                    // the newNode is the new root
                    newItem
                            .setNext(this.root)
                            .setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // Same!
                System.out.println(newItem.getValue() + " is already present");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item == null) return false;
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                System.out.println("Deleting item " + currentItem.getValue());
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {
                // We are at an item greater than where it would be
                return false;
            }
        }

        // Haven't found item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("List is empty");
            return;
        }
        while (root != null) {
            System.out.println(root.getValue());
            root = root.next();
        }

        // We could write this recursively
//        while (root != null) {
//            System.out.println(root.getValue());
//            traverse(root.next());
//        }
    }
}
