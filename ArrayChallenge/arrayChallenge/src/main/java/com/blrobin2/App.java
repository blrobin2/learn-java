package com.blrobin2;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {

    private static Scanner scanner = new Scanner(System.in);

    private App() {
    }

    /**
     * Get numbers from the user and print them sorted ascending.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int[] array = getIntegers(5);
        int[] sortedArray = sortIntegers(array);
        printArray(sortedArray);
    }

    private static int[] getIntegers(int size) {
        int[] newArray = new int[size];
        System.out.println("Enter " + size + " interger values\n");
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = scanner.nextInt();
        }

        return newArray;
    }

    private static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}
