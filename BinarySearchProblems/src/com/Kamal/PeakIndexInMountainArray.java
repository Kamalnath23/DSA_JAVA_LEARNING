package com.Kamal;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,2,0};
        System.out.println(getPeakIndexInMountainArray(a));

        int mountainArray[] = {4,2,7,9,8,3,1};
        System.out.println(getPeakIndexInMountainArray(mountainArray));

        int[] x={0,1,2,3,5,6,4,3,2};
        System.out.println(getPeakIndexInMountainArray(x));
    }

    public static int getPeakIndexInMountainArray(int[] Array){
        int start=0;
        int end= Array.length-1;

       // int mid= start+(end-start)/2;

        while(start<end){
            int mid = start +(end - start)/2;
            if(Array[mid] >= Array[mid+1]){
                //LHS
                //you're in dec part of the array
                //this may be the ans, but look at the left.
                //this is why end!= mid-1
                end=mid;
            }else if(Array[mid] <Array[mid+1]){
                //RHS
                //you're in ascending part of the array
                start = mid+1;
            }
        }
        //in the end start=end pointing to the largest number.
        //start and end are always trying to find max elements in the above 2 checks.
        //hence, when they're pointing to just 1 element, that is max one because that is what the check say.
        //more elaboration : at every pt osf start and end , they have the best possible ans till that time.
        // and if we're saying onlyy 1 item is remaining, that is the best possible ans.
        return start;
    }
}


