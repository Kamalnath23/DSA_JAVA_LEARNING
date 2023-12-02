package com.Kamal;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,0,1,2};
        //System.out.println(arr[findPivot(arr)]);
        System.out.println(search(arr,0));
    }

    public static int findPivot(int[] nums){
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid= start+ (end-start)/2;
            //4 cases over here:
            //CASE 1:
            if(mid<end && nums[mid]> nums[mid+1]){
                return mid+1;
            }
            //CASE 2:
            if(mid > start && nums[mid]< nums[mid-1]){
                return mid-1;
            }

            //CASE 3,4:
            if(nums[mid]<=nums[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        //If you did not find pivot, it means the array is not rotated.
        if(pivot==-1){
           //do normal binary search
            return searchBinary(nums, target, 0, nums.length-1);
        }
        //If Pivot is found, 2 ascending sorted arrays
        if(nums[pivot] == target){
            return  pivot;
        }
        if(target>=nums[0]){
            return searchBinary(nums, target, 0, pivot-1);
        }

        return searchBinary(nums, target, pivot, nums.length-1);
    }

    static int searchBinary(int array[], int target, int start, int end){
        //int start=0;
        //int end =array.length-1;

        while(start<=end){
            //FIND THE MIDDLE ELEMENT
            //int mid =(start+end)/2; //might be possible exceeds the range of integer
            int mid = start + (end - start)/2;
            if(target< array[mid]){
                //LHS
                end=mid-1;
            }else  if(target> array[mid]){
                start= mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
