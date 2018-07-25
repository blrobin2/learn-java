package com.blrobin2;

class LinkedList {
    private ListItem head;

    ListItem next() {
        return this.head;
    }

    void add(String item) {
        ListItem listItem = new LinkedListItem(item);
        if (this.head == null) {
            this.head = listItem;
            return;
        }
        if (head.compareTo(listItem) > 0) {
            ListItem temp = head;
            this.head = listItem;
            listItem.setNext(temp);
            temp.setPrevious(this.head);
            return;
        }

        ListItem current = this.head.next();
        while (current.next() != null) {
            if (current.compareTo(listItem) > 0) {
                ListItem prev = current.previous();
                prev.setNext(listItem);
                current.setPrevious(listItem);
                listItem.setNext(current);
                listItem.setPrevious(prev);
                return;
            }
            current = current.next();
        }

        current.setNext(listItem);
    }
}
