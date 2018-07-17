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
        // int[] myIntArray = makeArray(25);
        // printArray(myIntArray);

        // System.out.println(myIntArray[5]);
        // System.out.println(myIntArray[6]);
        // System.out.println(myIntArray[8]);
        int[] myIntegers = getIntegers(5);
        //printArray(myIntegers);
        System.out.println("The average is " + getAverage(myIntegers));
    }

    private static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    private static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

	private static int[] makeArray(int size) {
        // int[] myIntArray = new int[10];
        // myIntArray[0] = 45;
        // myIntArray[1] = 476;
        // myIntArray[5] = 50;

        // int[] myIntArray = { 1, 2, 3, 4, 5, 50, 7, 8, 9, 10 };

        // double[] myDoubleArray = new double[10];

		int[] myIntArray = new int[size];
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }
		return myIntArray;
	}

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }
}
