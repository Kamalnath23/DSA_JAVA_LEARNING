package com.Kamal;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //Create an Array
        // An Array is a collection of data stored in a single reference.
        int [] arr = {1,2,3,4,5};
        changeArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void changeArr(int[] array) {
        array[0]= 0;
    }
}
