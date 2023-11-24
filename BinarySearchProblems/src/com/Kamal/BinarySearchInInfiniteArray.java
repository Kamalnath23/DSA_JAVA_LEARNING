package com.Kamal;

public class BinarySearchInInfiniteArray {
    public static void main(String[] args) {
            int[] array = {3,5,7,10,12,14,16,19,23,25,58,31,35,36,38,41,43};
            int target=10;
            int ans=findingRangeAndBinarySearch(array,target);
        System.out.println(ans);

        System.out.println(findingRangeAndBinarySearch(array,23));
    }

    static int findingRangeAndBinarySearch(int[] array, int target) {
        //First find range
        // find with the box of size 2
        int start = 0;
        int end = 1;
        //condition for target to lie in the range.
        while(target>array[end]){
            int new_start= end+1;
            //end = end*2+ start+1
            end = end +(end-start+1)*2;
            start = new_start;
        }
        return binarySearchForInfiniteArray(array, target, start, end);
    }

    static int binarySearchForInfiniteArray(int[] array, int target, int start, int end) {
        //int start = array[0];
        //int end = array.length-1;
        while (start <= end) {
            //Find middle element
            int mid = (start) + (end - start) / 2;

            if (target < array[mid]) {
                //LHS
                end = mid - 1;
            } else if (target > array[mid]) {
                //RHS
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
