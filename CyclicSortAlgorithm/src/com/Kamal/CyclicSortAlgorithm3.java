package com.Kamal;

import java.util.Arrays;

public class CyclicSortAlgorithm3 {
    public static void main(String[] args) {
        int[] arr= {3,5,2,0,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2= {5,4,3,2,1,0};
        cyclicSort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3= {0,1,2,3,4,5};
        cyclicSort(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    public static void cyclicSort(int[] array){
        //check - swap - move
        int i=0;
        while(i< array.length){
            int correctIndex = array[i]; //index=value
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
}
