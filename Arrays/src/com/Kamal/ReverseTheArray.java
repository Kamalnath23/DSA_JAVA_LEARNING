package com.Kamal;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        reverse(a);
        System.out.println(Arrays.toString(a));

        int b[] = {2,3,4,5,6,7};
        reverse(b);
        System.out.println(Arrays.toString(b));
    }
    public static void reverse(int[] a){
            int start = 0;
            int end =a.length - 1;
            while(start<end) {
                //swap
                swap(a, start, end);
                start++;
                end--;
            }
    }

    public static void swap(int[] a, int index1, int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
