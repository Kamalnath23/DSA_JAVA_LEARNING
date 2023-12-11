package com.kamal;

import java.util.Arrays;

public class BubbleSortAlgorithm2 {
    static long startTime;
    static long endTime;

    public static void main(String[] args) {
        int[] arr3= new int[10000];
        for(int i=0; i<arr3.length; i++){
            arr3[i] = i+1;
        }
        //Arrays.sort(arr3, Collections.reverseOrder());
        reverse(arr3);
        bubbleSort(arr3);;
        System.out.println("total time "+totalTime()+" nano seconds.");
        System.out.println(Arrays.toString(arr3));

        //2
        int[] arr={5,4,2,3,1};
        bubbleSort(arr);
        System.out.println("total time "+totalTime()+" nano seconds.");
        System.out.println(Arrays.toString(arr));

        //3
        int[] arr4= new int[100000];
        for(int i=0; i<arr4.length; i++){
            arr4[i] = i+1;
        }
        //Arrays.sort(arr3, Collections.reverseOrder());
        reverse(arr4);
        bubbleSort(arr4);;
        System.out.println("total time "+totalTime()+" nano seconds.");
       // System.out.println(Arrays.toString(arr4));

        int[] arr5= new int[1000000];
        for(int i=0; i<arr5.length; i++){
            arr5[i] = i+1;
        }
        //Arrays.sort(arr3, Collections.reverseOrder());
        reverse(arr5);
        bubbleSort(arr5);;
        System.out.println("total time "+totalTime()+" nano seconds.");
        // System.out.println(Arrays.toString(arr4));

    }

    public static  void reverse(int[] array){

        //length of an array
        int n= array.length;;
        for(int i=0; i< n/2; i++){
            //sorting the first half of the elements temporarily
            int temp=array[i];
            array[i]= array[n-i-1];
            array[n-i-1] = temp;
        }

    }

    public static  void bubbleSort(int[] array){
        startTime = System.nanoTime();
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
        endTime = System.nanoTime();
    }

    public static long totalTime(){
        return endTime - startTime;
    }
}
