package com.Kamal;

import java.util.Arrays;
import java.util.Collections;

public class OrderAgonisticBinarySearch {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i <= 9; i++) {
            a[i] = i;
        }
        int ans = orderAgnosticBinarySearch(a, 5);
        System.out.println(ans);
        int[] d={9,8,6,5,3,2,1,0,-1,-2,-4,-9};
//        Integer[] d = new Integer[10];
//        for (int i = 0; i <= 9; i++) {
//            d[i] = i;
//        }
//        Arrays.sort(d, Collections.reverseOrder());
        int ans2 = orderAgnosticBinarySearch(d, 9);
        System.out.println(ans2);
    }


    static int orderAgnosticBinarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        //Find whether array is sorted in ascending or descending
        boolean isAsc = array[start] < array[end];
//        if(array[start] < array[end]){
//            isAsc = true;
//        }else if(array[start] > array[end]){
//            isAsc = false;
//        }
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