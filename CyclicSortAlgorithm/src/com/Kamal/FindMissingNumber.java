package com.Kamal;
// https://leetcode.com/problems/missing-number/

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] a = {4, 0, 1, 2};
        System.out.println(missingNumber(a));
        ;

        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
        ;
        int[] nums2 = {0, 1};
        System.out.println(missingNumber(nums2));
        ;
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(nums3));

    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, nums[i]);
            } else {
                i++;
            }
        }

        //search for missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        //case 2
        return nums.length;

    }

    public static void cyclicSort(int[] array) {
        //check - swap - move
        int i = 0;
        while (i < array.length) {
            int correctIndex = array[i]; //index=value
            if (array[i] != array[correctIndex]) {
                swap(array, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
