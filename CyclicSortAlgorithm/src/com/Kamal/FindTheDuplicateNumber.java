package com.Kamal;
// https://leetcode.com/problems/find-the-duplicate-number/
public class FindTheDuplicateNumber {
    public static void main(String[] args) {
            int[] a = {1,3,4,2,2};
            int[] b= {3,1,3,4,2};
        System.out.println(findDuplicate(a));
        System.out.println(findDuplicate(b));
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

    public static int findDuplicate(int[] nums) {
        cyclicSort(nums);
        //Just find the duplicate number
        int findDuplicate =0;
        for(int i=0; i< nums.length; i++) { //i represents index.
            if(nums[i] != i+1){
                findDuplicate = nums[i];
            }
        }
        return  findDuplicate;
    }

}
