package com.blrobin2;

import java.util.ArrayList;

//class IntClass {
//    private int value;
//
//    IntClass(int value) {
//        this.value = value;
//    }
//
//    public int getValue() {
//        return value;
//    }
//
//    public void setValue(int value) {
//        this.value = value;
//    }
//}


public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tim");

        //ArrayList<int> intArrayList = new ArrayList<int>();
//        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
//        intClassArrayList.add(new IntClass(54));

        // Unnecessary, but illustrates that there are class versions of primitives
        Integer integer = new Integer(54);
        Double doubleValue = new Double(32.25);

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }

//        for (int i = 0; i < integerArrayList.size(); i++) {
//            System.out.println(i + " ==> " + integerArrayList.get(i).intValue());
//        }

        // Autoboxing
        Integer myIntValue = 56; // same as Integer.valueOf(56)
        int myInt = myIntValue; // same as myIntValue.intValue()

        // Unboxing
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        for (double d = 0.0; d <= 10.0; d += 0.5) {
            doubleArrayList.add(d); // No need to un-box
        }

        for (int i = 0; i < doubleArrayList.size(); i++) {
            double value = doubleArrayList.get(i); // No need to un-box
            System.out.println(i + " --> " + value);
        }
    }
}
