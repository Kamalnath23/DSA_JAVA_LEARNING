package com.Kamal;
// https://in.search.yahoo.com/search?fr=mcafee&type=E210IN1274G0&p=find+in+mountain+array+leetcode
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,2,0};
        System.out.println(getPeakIndexInMountainArray(a));

        int mountainArray[] = {4,2,7,9,8,3,1};
        System.out.println(getPeakIndexInMountainArray(mountainArray));

        int[] x={0,1,2,3,5,6,4,3,2,1};
        System.out.println(getPeakIndexInMountainArray(x));
        int[] y= {4,7,10,12,15,8,6,3,1};
        System.out.println(search(y,3));
        System.out.println(search(y,10));
    }

    static int search(int[] arr, int target) {
        int peak = getPeakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBinarySearch(arr, target, peak+1, arr.length - 1);
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

    static int orderAgnosticBinarySearch(int[] array, int target, int start, int end) {
        //int start = 0;
        //int end = array.length - 1;
        //Find whether array is sorted in ascending or descending
        boolean isAsc = array[start] < array[end];
        while (start <= end) {
            //FIND THE MIDDLE ELEMENT
            //int mid =(start+end)/2; //might be possible exceeds the range of integer
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
                //break;
            }
            if (isAsc == true) {
                if (target < array[mid]) {
                    //LHS
                    end = mid - 1;
                } else  { //if (target > array[mid])
                    start = mid + 1;
                }
            } else {
                if (target > array[mid]) {
                    //LHS
                    end = mid - 1;
                } else { // if (target < array[mid])
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}


