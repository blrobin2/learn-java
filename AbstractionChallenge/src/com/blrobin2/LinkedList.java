package com.blrobin2;

class LinkedList<T> {
    private ListItem head;

    ListItem next() {
        return this.head;
    }

    boolean add(T item) {
        LinkedListItem<T> listItem = new LinkedListItem<>(item);
        // No head yet, this is our first
        if (this.head == null)
            return addItemAsHead(listItem);

        // Comes before Head
        if (head.compareTo(listItem) > 0)
            return addItemBeforeHead(listItem);

        ListItem current = this.head.next();
        while (current.next() != null) {
            // Already added
            if (current.compareTo(listItem) == 0) return false;
            // Comes before current
            if (current.compareTo(listItem) > 0)
                return addItemBeforeCurrent(listItem, current);
            current = current.next();
        }

        // Comes just before last item
        if (current.compareTo(listItem) > 0)
            return addItemBeforeCurrent(listItem, current);

        // Add to end
        return addItemAfterCurrent(listItem, current);
    }

    private boolean addItemAsHead(ListItem listItem) {
        this.head = listItem;
        return true;
    }

    private boolean addItemBeforeHead(ListItem listItem) {
        ListItem temp = head;
        this.head = listItem;
        listItem.setNext(temp);
        temp.setPrevious(this.head);
        return true;
    }

    private boolean addItemBeforeCurrent(ListItem listItem, ListItem current) {
        ListItem prev = current.previous();
        prev.setNext(listItem);
        current.setPrevious(listItem);
        listItem.setNext(current);
        listItem.setPrevious(prev);
        return true;
    }

    private boolean addItemAfterCurrent(ListItem listItem, ListItem current) {
        current.setNext(listItem);
        listItem.setPrevious(current);
        return true;
    }
}
