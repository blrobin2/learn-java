package com.blrobin2;

abstract class ListItem {
    private ListItem next;
    private ListItem previous;
    private String value;

    ListItem(String value) {
        this.value = value;
    }

    ListItem next() {
        return next;
    }

    ListItem previous() {
        return previous;
    }

     void setNext(ListItem next) {
        this.next = next;
    }

    void setPrevious(ListItem previous) {
        this.previous = previous;
    }

    String value() {
        return value;
    }

    int compareTo(ListItem otherValue) {
        return value.compareTo(otherValue.value());
    }
}
