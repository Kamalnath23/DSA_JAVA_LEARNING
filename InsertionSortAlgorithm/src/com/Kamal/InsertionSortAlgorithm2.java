package com.Kamal;

import java.util.Arrays;

public class InsertionSortAlgorithm2 {
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
        insertionSort(arr3);;
        System.out.println("total time "+totalTime()+" nano seconds.");
        System.out.println(Arrays.toString(arr3));

        //2
        int[] arr={5,4,2,3,1};
        insertionSort(arr);
        System.out.println("total time "+totalTime()+" nano seconds.");
        System.out.println(Arrays.toString(arr));

        //3
        int[] arr4= new int[100000];
        for(int i=0; i<arr4.length; i++){
            arr4[i] = i+1;
        }
        //Arrays.sort(arr3, Collections.reverseOrder());
        reverse(arr4);
        insertionSort(arr4);;
        System.out.println("total time "+totalTime()+" nano seconds.");
        // System.out.println(Arrays.toString(arr4));

        int[] arr5= new int[1000000];
        for(int i=0; i<arr5.length; i++){
            arr5[i] = i+1;
        }
        //Arrays.sort(arr3, Collections.reverseOrder());
        reverse(arr5);
        insertionSort(arr5);;
        System.out.println("total time "+totalTime()+" nano seconds.");

        int[] a = {3, 4, 5, 1, 2};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
        int[] b = {1, 2, 3, 4, 5};
        insertionSort(b);
        System.out.println(Arrays.toString(b));
        int[] c = {5, 4, 3, 2, 1};
        insertionSort(c);
        System.out.println(Arrays.toString(c));
    }

    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    static void insertionSort(int[] array) {
        startTime = System.nanoTime();
        for (int i = 0; i <= array.length - 2; i++) { //i<array.length-1
            for(int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                } else {
                    break;
                }
            }
        }
        endTime = System.nanoTime();
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
