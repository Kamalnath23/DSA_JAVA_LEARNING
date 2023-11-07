package com.Kamal;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int[] arr= new int[5];
        arr[0]=23;
        arr[1]=22;
        arr[2]=45;
        arr[4]=0;
        arr[3]=3;
        System.out.println(arr[4]);
        //Array of Primitives
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


        //Input using for loop
        System.out.println("Enter an array data");
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0; i<a.length; i++){
            a[i]= sc.nextInt();
        }
        //print the output
        System.out.println("print the output");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }

        //print the output using enhaced for loop
        System.out.println("\nPrint the output using enhaced for loop");
        for (int j : a) { //for every element in the array, print the element
            System.out.print(j + " "); // herre j represents the elements of the array
        }

        //Print using toString method of Array class
        System.out.println("\nPrint using toString method of Array class");
        System.out.println(Arrays.toString(a));
    }
}
