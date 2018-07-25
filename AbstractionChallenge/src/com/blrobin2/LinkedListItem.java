package com.blrobin2;

class LinkedListItem<T> extends ListItem<T> {
    LinkedListItem(T value) {
        super(value);
    }

    int compareTo(ListItem otherValue) {
        return value().toString().compareTo(otherValue.value().toString());
    }
}
