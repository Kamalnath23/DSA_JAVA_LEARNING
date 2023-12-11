package com.kamal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] x={1,2,3,4,5};
        bubbleSort(x);
        System.out.println(Arrays.toString(x));

        int[] arr={5,4,2,3,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2={1,2,3,4,5};
        bubbleSort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3= {-32,-8-12,0,6,-41,61,72,1,-1,-2,2,3,-3};
        bubbleSort(arr3);
        System.out.println(Arrays.toString(arr3));

    }

    public static  void bubbleSort(int[] array){
        boolean swapped;
        //run the steps n-1 times
        for(int i=0; i< array.length; i++){
            swapped = false;
            //For each steps, max item will come at the last respective index.
            for(int j=1; j<= array.length-i-1 ;j++){ // j< array.length-i
                //swap if the item is smaller than the prev item.
                if(array[j] < array[j-1]){
                    //swap
                    int temp = array[j];
                    array[j] =  array[j-1];
                    array[j-1] = temp;
                    swapped=true;
                }
            }
            //if you did not swap for particular value of i, it means array is sorted and we can end the program.
            if(!swapped){
                break;
            }
        }
    }
}
