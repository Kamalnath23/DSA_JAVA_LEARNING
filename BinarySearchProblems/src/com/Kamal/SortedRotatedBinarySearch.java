package com.Kamal;

public class SortedRotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int[] arr2={1};
        int[] arr3= {1,2};
        int[] arr4= {3,1,2};
        int[] arr5= {3,4,2};
        int[] arr6= {2,1};
        int[] arr7= {1,2,3};
        int[] arr9 = {91,93,96,97,3,4,5,11,14,23,47,52,61,69,72,74,81,87,90};
        int[] arr10 = {2,4,6,8,10};
        int[] arr11= {9,1,3,5,7};
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 3));

        System.out.println(search(arr,6));
        System.out.println(search(arr2,6));
        System.out.println(search(arr2,1));
        System.out.println(search(arr2,0));

    }

    public static int findPivot(int[] array){
        if(array.length==1){
            return 0;
        }
        int start=0;
        int end= array.length-1;

        while(start<=end){
            int mid = start +(end-start)/2;
            //Case 1:
            if(mid<end && array[mid]> array[mid+1]){
                return mid;
            }
            //case 2:
            if(mid>start && array[mid]< array[mid-1]){
                return mid-1;
            }
            if (array[mid] <= array[start]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }

    public static  int search(int[] nums, int target){
        int pivot= findPivot(nums);
        //if you did not find a pivot, that ,means array is not rotated
        if(pivot==-1){
            return  searchBinary(nums, target,0, nums.length-1);
        }

        //if pivot is found, two ascending sorted array is found
        //case 1: If pivot element = target// return pivot
        if(nums[pivot]== target){
            return pivot;
        }

        //Case 2: if target element > start// search space --> start to pivot-1
        //why?
        if(target>=nums[0]){
            return searchBinary(nums, target, 0, pivot-1);
        }

        //case 3: if target < start ele // search space --> pivot+1 to end
        if(target<nums[0]){
            return searchBinary(nums, target, pivot+1, nums.length-1);
        }

        return -1;
    }

    static int searchBinary(int array[], int target,  int start, int end ){
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
