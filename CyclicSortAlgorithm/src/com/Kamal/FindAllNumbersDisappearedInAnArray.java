package com.Kamal;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
            int[] x= {4,3,2,7,8,2,3,1};
        int[] y= {1,1};
        System.out.println(findDisappearedNumbers(x).toString());
        System.out.println(f    indDisappearedNumbers(y).toString());

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

    public static List<Integer> findDisappearedNumbers(int[] nums){
        cyclicSort(nums);
        //Just find the missing number.
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i< nums.length; i++){ //i represents index.
            if(nums[i] != i+1){
                ans.add(i+1);
            }
        }
    return ans;

    }

    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
