package com.Kamal;

import java.util.Arrays;

public class CyclicSortAlgorithm2 {
    static long startTime;
    static long endTime;

    public static long totalTime(){
        return endTime - startTime;
    }
    public static void main(String[] args) {
        int[] arr= {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println("total time "+totalTime()+" nano seconds.");
        System.out.println(Arrays.toString(arr));

        int[] array2 = {5,4,3,2,1};
        cyclicSort(array2);
        System.out.println("total time "+totalTime()+" nano seconds.");
        System.out.println(Arrays.toString(array2));

        int[] array3 = {1,2,3,4,5};
        cyclicSort(array3);
        System.out.println("total time "+totalTime()+" nano seconds.");
        System.out.println(Arrays.toString(array3));

        //4
        int[] arr3= new int[10000];
        for(int i=0; i<arr3.length; i++){
            arr3[i] = i+1;
        }
        //Arrays.sort(arr3, Collections.reverseOrder());
        reverse(arr3);
        cyclicSort(arr3);;
        System.out.println("total time "+totalTime()+" nano seconds.");
        System.out.println(Arrays.toString(arr3));

        //5
        int[] arr4= new int[100000];
        for(int i=0; i<arr4.length; i++){
            arr4[i] = i+1;
        }
        //Arrays.sort(arr3, Collections.reverseOrder());
        reverse(arr4);
        cyclicSort(arr4);;
        System.out.println("total time "+totalTime()+" nano seconds.");
       // System.out.println(Arrays.toString(arr4));

        //6
        int[] arr5= new int[1000000];
        for(int i=0; i<arr5.length; i++){
            arr5[i] = i+1;
        }
        //Arrays.sort(arr3, Collections.reverseOrder());
        reverse(arr5);
        cyclicSort(arr5);;
        System.out.println("total time "+totalTime()+" nano seconds.");
        //System.out.println(Arrays.toString(arr5));


    }

    public static void cyclicSort(int[] array){
        startTime = System.nanoTime();
        //check - swap - move
        int i=0;
        while(i< array.length){
            int correctIndex = array[i]-1; //index=value-1
            if(array[i] != array[correctIndex]){
                swap(array, i, correctIndex);
            }else{
                i++;
            }
        }
        endTime = System.nanoTime();
    }

    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
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
}
