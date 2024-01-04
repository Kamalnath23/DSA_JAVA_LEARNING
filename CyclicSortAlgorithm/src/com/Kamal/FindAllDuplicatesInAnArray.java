package com.Kamal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        int [] nums1= {4,3,2,7,8,2,3,1};
        int [] nums2= {1,1,2};
        int [] nums3= {};
        System.out.println(findDuplicates(nums1).toString());
        System.out.println(findDuplicates(nums2).toString());
        System.out.println(findDuplicates(nums3).toString());


    }

    public static void cyclicSort(int[] array){
        //check - swap - move
        int i=0;
        while(i< array.length){
            int correctIndex = array[i]-1; //index=value-1
            if(array[i] != array[correctIndex]){
                swap(array, i, correctIndex);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static List<Integer> findDuplicates(int[] nums) {
        cyclicSort(nums);
        //Just find the duplicate number
        List<Integer> duplicatesInArray = new ArrayList<>();
        for(int i=0; i< nums.length; i++) { //i represents index.
            if(nums[i] != i+1){
                //findDuplicate = nums[i];
                duplicatesInArray.add(nums[i]);
            }
        }

       return duplicatesInArray;
    }
}
