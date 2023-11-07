package com.Kamal;

import java.util.Arrays;

public class SwapInArray {
    public static void main(String[] args) {
        int a[] = {1,3,5,7,9};
        System.out.println(Arrays.toString(a));
        swap(a, 1,3);
        System.out.println(Arrays.toString(a));
    }

    /**
     *
     * @param a
     * @param index1
     * @param index2
     */
    public static void swap(int[] a, int index1, int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
