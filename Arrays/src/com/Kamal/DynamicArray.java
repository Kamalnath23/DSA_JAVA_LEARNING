package com.Kamal;

public class DynamicArray {
    public static void main(String[] args) {
        int [] [] a = {
                {45, 77, 18},
                {96, 1, 63, 8},
                {11, 93, 23, 13}
        };


        for(int row=0; row < a.length; row++){
                for(int col=0; col<a[row].length; col++){
                    System.out.print(a[row][col]+" ");
                }
            System.out.println();
        }
    }
}
