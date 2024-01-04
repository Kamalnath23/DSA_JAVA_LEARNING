package com.Kamal;
// https://leetcode.com/problems/first-missing-positive/
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] a ={1,2,0};
        int[] b= {3,4,-1,1};
        int[] c= {7,8,9,11,12};


        System.out.println(firstMissingPositive(a));
        System.out.println(firstMissingPositive(b));
        System.out.println(firstMissingPositive(c));
    }

    //modified in if conditions
    public static void cyclicSort(int[] array){
        //check - swap - move
        int i=0;
        while(i< array.length){
            int correctIndex = array[i]-1; //index=value-1
            if(array[i]>0 && array[i] <= array.length && array[i] != array[correctIndex]){
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

    public static int firstMissingPositive(int[] nums) {
        cyclicSort(nums);
        // Search for first missing positive.
        for(int i=0; i< nums.length; i++){
            if(nums[i] != i+1){
                return  i+1;
            }
        }
        //case 2
        return nums.length+1;
    }

    /*
    public static int firstMissingPositive(int[] nums) {
        int firstMissingPositive =1;
        cyclicSort(nums);
        if(nums[0] !=1){
            return firstMissingPositive;
        }else{
            for(int i=0; i<nums.length; i++){
                if(nums[i]!=i+1){
                    firstMissingPositive =i+1;
                    return firstMissingPositive;
                }
            }
        }
        return firstMissingPositive;
    }
    */


}
