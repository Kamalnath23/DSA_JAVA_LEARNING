package com.Kamal;

import java.util.Arrays;
import java.util.Scanner;

public class Input2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        System.out.println(arr.length); //prints 3 (no.of.rows)
        System.out.println(arr[0].length); //3
        System.out.println(arr[1].length); //2
        System.out.println(arr[2].length); //4

        //Input
        System.out.println("Enter 2 D array of size 3 times 2");
        Scanner s = new Scanner(System.in);

    //For every row
        for(int row= 0; row < arr.length; row++){
            //for every column
            for(int col=0; col < arr[row].length;col++){
                    arr[row][col] = s.nextInt();
            }
        }
        //System.out.println(Arrays.toString(arr));

        //Output
        System.out.println("Output 1 - Dual for loop");
        for(int row= 0; row < arr.length; row++){
            //for every column
            for(int col=0; col < arr[row].length;col++){ // arr[row] implements the size of the row
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        //Output 2
        System.out.println("Output 2 -- one for loop and toStr=ing method");
        for(int row= 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        //Output 3
        System.out.println("Output 3 -- one enhanced for loop and toString method");
        for(int [] row: arr ){
            System.out.println(Arrays.toString(row));
        }

    }
}
