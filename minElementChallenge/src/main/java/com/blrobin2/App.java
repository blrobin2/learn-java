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
        System.out.print("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] integers = readIntegers(count);
        int min = findMin(integers);

        System.out.println("min= " + min);
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }

        return array;
    }

    private static int findMin(int[] integers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < integers.length; i++) {
            int value = integers[i];
            if (value < min) {
                min = value;
            }
        }

        return min;
    }
}
