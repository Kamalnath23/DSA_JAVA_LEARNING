package com.Kamal;

import java.util.Arrays;

public class PassingArraysInFuntion {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[0]= 99;
    }
}
