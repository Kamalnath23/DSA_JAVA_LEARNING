package com.Kamal;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
            int[][] a  = new int[3][];  // no.of.cols is not mandatory to specify. N.of. rows is mandatory.

            int [][] b = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };
        System.out.println(Arrays.toString(b[1]));
        System.out.println(b[1][0]);

        int [][] c = {
                {1,2,3}, //0th index
                {4,5}, //1st index
                {6,7,8,9} //2nd index --> c[2] --> {6,7,8,9}
        };

    }
}
