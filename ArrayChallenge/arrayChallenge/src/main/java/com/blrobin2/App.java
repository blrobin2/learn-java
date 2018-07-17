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
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = scanner.nextInt();
        }

        return newArray;
    }

    private static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        int i = 0;
        while (array.length > 0) {
            int largest = findLargestIndex(array);
            sortedArray[i] = array[largest];
            array = removeAtIndex(array, largest);
            i++;
        }

        return sortedArray;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int findLargestIndex(int[] array) {
        int largest = array[0];
        int largestIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
                largestIndex = i;
            }
        }

        return largestIndex;
    }

    private static int[] removeAtIndex(int[] array, int index) {
        int[] newArr = new int[array.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = array[i];
        }
        for (int i = index; i < array.length - 1; i++) {
            newArr[i] = array[i + 1];
        }

        return newArr;
    }
}
