package com.Kamal;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
            int[] nums = {5,7,7,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, 7)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        //Check for first occurence if target first
        int first = BinarySearch( nums, target, true);
        int last = BinarySearch( nums, target, false);
        ans[0] = first;
        ans[1] = last;
        return ans;
    }


    static int BinarySearch(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            //FIND THE MIDDLE ELEMENT
            //int mid =(start+end)/2; //might be possible exceeds the range of integer
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                //LHS
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //potential answer is found.
                // return mid;
                ans=mid;
                if(findStartIndex){
                        end = mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
