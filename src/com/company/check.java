package com.company;

import java.util.Arrays;

public class check {
    public static int enumer(double[] array, double key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;
        }
        return -1;
    }
    public static int binaryCheck(double[] sortedArray, double key) {
        return binaryCheck(sortedArray, key, 0, sortedArray.length);
    }
    private static int binaryCheck
            (double[] sortedArray, double key, int low, int high) {
        int middle = (low + high) / 2;

        if (high < low) {
            return -1;
        }

        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return binaryCheck(
                    sortedArray, key, low, middle - 1);
        } else {
            return binaryCheck(
                    sortedArray, key, middle + 1, high);
        }
    }


    private static double[] generateRandomArray(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public static void main(String[] args) {
        double[] array = generateRandomArray(100000000);
        Arrays.sort(array);

        long time = System.currentTimeMillis();
        enumer(array, 0.5);
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        binaryCheck(array, 0.5);
        System.out.println(System.currentTimeMillis() - time);
    }

}
