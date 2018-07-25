package com.blrobin2;

abstract class ListItem<T> {
    private ListItem next;
    private ListItem previous;
    private T value;

    ListItem(T value) {
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

    T value() {
        return value;
    }

    abstract int compareTo(ListItem otherValue);
}
