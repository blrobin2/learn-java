package com.blrobin2;

class X {
    private int x;

    X(int x) {
        this.x = x;
    }

    void x() {
        for (int x = 1; x <= 12; x++) {
            System.out.println(this.x + " times " + x + " = " + this.x * x);
        }
    }
}
