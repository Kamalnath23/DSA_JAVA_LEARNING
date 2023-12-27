package com.Kamal;

import java.util.Arrays;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 1, 2};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
        int[] b = {1, 2, 3, 4, 5};
        insertionSort(b);
        System.out.println(Arrays.toString(b));
        int[] c = {5, 4, 3, 2, 1};
        insertionSort(c);
        System.out.println(Arrays.toString(c));
    }

    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    static void insertionSort(int[] array) {
        for (int i = 0; i <= array.length - 2; i++) { //i<array.length-1
            for(int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }


}
