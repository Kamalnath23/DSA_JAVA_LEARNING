package com.Kamal;

import java.util.Arrays;

public class SelectionSortAlgorithm2 {
    static long startTime;
    static long endTime;

    public static long totalTime(){
        return endTime - startTime;
    }

    public static void main(String[] args) {
        int[] arr3= new int[10000];
        for(int i=0; i<arr3.length; i++){
            arr3[i] = i+1;
        }
        //Arrays.sort(arr3, Collections.reverseOrder());
        reverse(arr3);
        SelectionSort(arr3);;
        System.out.println("total time "+totalTime()+" nano seconds.");
        System.out.println(Arrays.toString(arr3));

        //2
        int[] arr={5,4,2,3,1};
        SelectionSort(arr);
        System.out.println("total time "+totalTime()+" nano seconds.");
        System.out.println(Arrays.toString(arr));

        //3
        int[] arr4= new int[100000];
        for(int i=0; i<arr4.length; i++){
            arr4[i] = i+1;
        }
        //Arrays.sort(arr3, Collections.reverseOrder());
        reverse(arr4);
        SelectionSort(arr4);;
        System.out.println("total time "+totalTime()+" nano seconds.");
        // System.out.println(Arrays.toString(arr4));

        int[] arr5= new int[1000000];
        for(int i=0; i<arr5.length; i++){
            arr5[i] = i+1;
        }
        //Arrays.sort(arr3, Collections.reverseOrder());
        reverse(arr5);
        SelectionSort(arr5);;
        System.out.println("total time "+totalTime()+" nano seconds.");
        // System.out.println(Arrays.toString(arr4));
    }

    public static void SelectionSort(int[] array){
        startTime = System.nanoTime();
        for(int i=0; i< array.length; i++){
            //find the max item in remaining array and swap with correct index.
            int last= array.length-i-1;
            int maxIndex=getMaxIndex(array,0, last);
            swap(array,maxIndex, last);
        }
        endTime = System.nanoTime();
    }

    private static int getMaxIndex(int[] array, int start, int end) {
        int max= start;
        for(int i=start; i<=end; i++){
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
