package com.Kamal;
// Matrix is sorted in Row wise and col wise manner
import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] $2Darray ={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        System.out.println(Arrays.toString(search( $2Darray, 37)));
        System.out.println(Arrays.toString(search( $2Darray, 57)));
        System.out.println(Arrays.toString(search( $2Darray, 10)));
        System.out.println(Arrays.toString(search( $2Darray, 20)));
        System.out.println(Arrays.toString(search( $2Darray, 30)));
        System.out.println(Arrays.toString(search( $2Darray, 40)));
        System.out.println(Arrays.toString(search( $2Darray, 15)));
        System.out.println(Arrays.toString(search( $2Darray, 25)));
        System.out.println(Arrays.toString(search( $2Darray, 35)));
        System.out.println(Arrays.toString(search( $2Darray, 45)));
        System.out.println(Arrays.toString(search( $2Darray, 41)));
        System.out.println(Arrays.toString(search( $2Darray, 50)));

        int[][] $2Darray3 ={
                {10,20,30},
                {15,25,35},
                {28,29,37}
        };
      System.out.println(Arrays.toString(search( $2Darray3, 37)));

        int[][] $2Darray2 ={
                {10,20,30},
                {15,25,35},
                {28,29,37},
                {33,34,38}
        };
        System.out.println(Arrays.toString(search( $2Darray2, 37)));


    }

    public static int[] search(int[][] Matrix, int target){
        System.out.println(Matrix.length);
        int Row=0;
        int Col = Matrix[Row].length-1;
        //int Col = Matrix.length-1;
        while(Row< Matrix.length && Col >=0){
            //3 cases
            //case 1:
            if(Matrix[Row][Col] == target){
                return new int[]{Row, Col};
            }

            if(Matrix[Row][Col] < target){
                Row++;
            }else{
                // Matrix[Row][Col] > target
                Col--;
            }
        }
        return new int[]{-1, -1};
    }
}
