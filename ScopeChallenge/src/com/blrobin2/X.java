package com.blrobin2;

import java.util.Scanner;

class X {
    private int x;

    X(Scanner x) {
        System.out.println("Please enter a number: ");
        this.x = x.nextInt();
    }

    void x() {
        for (int x = 1; x <= 12; x++) {
            System.out.println(x + " times " + this.x + " = " + this.x * x);
        }
    }
}
