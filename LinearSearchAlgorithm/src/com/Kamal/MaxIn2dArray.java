package com.Kamal;

import java.util.Arrays;

public class MaxIn2dArray {
    public static void main(String[] args) {
            int a[][] = {
                    {23,45,77},
                    {18,17,3,71},
                    {56,78,90,34,101,56}
            };
        System.out.println(max(a));
        System.out.println(max2(a));
    }
    //for loop
    static  int max(int[][] array){
        int max= array[0][0];
        for(int row=0; row<array.length; row++){
            for(int col=0; col< array[row].length; col++){
                if(array[row][col] > max){
                        max= array[row][col];
                }
            }
        }

        return max;
    }

    //Enhanced for loop
    static  int max2(int[][] array){
        int max= array[0][0];
        for (int[] ints : array) {
            for (int col = 0; col < ints.length; col++) {
                if (ints[col] > max) {
                    max = ints[col];
                }
            }
        }

        return max;
    }




}
