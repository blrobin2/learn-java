package com.blrobin2;

import java.util.Arrays;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        int length = array.length;
        int temp, lastIndex;
        for (int i = 0; i < (length / 2); i++) {
            lastIndex = length - 1 - i;
            temp = array[i];
            array[i] = array[lastIndex];
            array[lastIndex] = temp;
        }
    }
}
