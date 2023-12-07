package com.Kamal;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
            int[] a={7,2,5,10,8};
            int []b = {1,2,3,4,5};
        System.out.println(splitArraysplitArray(a,2));
        System.out.println(splitArraysplitArray(b,2));
    }

    public static int splitArraysplitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for(int i=0; i<nums.length;i++){
            start=Math.max(start, nums[i]); //return max item from array 9linear search)
            end+=nums[i];
        }

        //Binary Search
        while(start<end){
            //Try for middle as potential ans
            int mid= start+(end-start)/2;
            //Calculate how many pieces you can divide this in with this max sum
            int sum=0;
            int pieces = 1;
            for(int num:nums){
                if(sum+num > mid){
                    //you cannot make in sub array. make new one
                    //say you add  this num in new sub array, them sum=num
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }
            if(pieces>k){
                start=mid+1;
            }else{
                end=mid;
            }

        }
        return end; //end = start
    }
}
