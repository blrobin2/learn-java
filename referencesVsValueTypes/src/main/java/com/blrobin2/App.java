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
        // Value types
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue= " + myIntValue);
        System.out.println("anotherIntValue= " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue= " + myIntValue);
        System.out.println("anotherIntValue= " + anotherIntValue);


        // Reference types

        // reference array with new
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherArray= " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("after change myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray= " + Arrays.toString(anotherArray));

        // dereferencing array, using new
        anotherArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("after modifyArray myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after modifyArray anotherArray= " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        // dereferencing array using new
        array = new int[] {1, 2, 3, 4, 5};
    }
}
