package com.Kamal;

import java.util.Arrays;

public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        int[] x={1,2,3,4,5};
        SelectionSort(x);
        System.out.println(Arrays.toString(x));

        int[] arr={5,4,2,3,1};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2={1,2,3,4,5};
        SelectionSort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3= {-32,-8-12,0,6,-41,61,72,1,-1,-2,2,3,-3};
        SelectionSort(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    public static void SelectionSort(int[] array){
        for(int i=0; i< array.length; i++){
            //find the max item in remaining array and swap with correct index.
            int last= array.length-i-1;
            int maxIndex=getMaxIndex(array,0, last);
            swap(array,maxIndex, last);
        }
    }

    private static int getMaxIndex(int[] array, int start, int end) {
        int max= start;
        for(int i=0; i<=end; i++){
            if(array[max]< array[i]){
                max=i;
            }
        }
        return max;
    }

    static  void swap(int[] array, int first, int second){
        int temp= array[first];
        array[first]= array[second];
        array[second] = temp;
    }
}
