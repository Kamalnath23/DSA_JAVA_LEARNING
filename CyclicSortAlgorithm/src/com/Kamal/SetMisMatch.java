package com.Kamal;

import java.util.Arrays;

public class SetMisMatch {
    public static void main(String[] args) {
        //1 to N
        int[] a={1,2,2,4};
        int[] b= {1,1};
        System.out.println(Arrays.toString(findErrorNums(a)));
        System.out.println(Arrays.toString(findErrorNums(b)));
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

    public static int[] findErrorNums(int[] nums) {
        cyclicSort(nums);
        int[] ans = new int[2];
        for(int i=0; i<nums.length;i++){
            if(nums[i] != i+1){
                ans[0] = nums[i]; //duplicate number
                ans[1] = i+1; //missing number
            }
        }
        return ans;
    }
}
