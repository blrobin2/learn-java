package com.blrobin2;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.print("Enter how many integers you will be inputting: ");
        int count = scanner.nextInt();
        int[] integers = readIntegers(count);
        int min = findMin(integers);

        System.out.println("The minimum value is " + min);
    }

    private static int[] readIntegers(int count) {
        System.out.print("Enter " + count + " integers: ");
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int findMin(int[] integers) {
        int min = integers[0];
        for (int i = 1; i < integers.length; i++) {
            if (integers[i] < min) {
                min = integers[i];
            }
        }

        return min;
    }
}
