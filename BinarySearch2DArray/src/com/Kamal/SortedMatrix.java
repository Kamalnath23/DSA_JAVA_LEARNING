package com.Kamal;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
            int[][] array={
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
            };

        int[][] array2={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int[][] array3={
                {1,2},
                {5,6},
                {9,10},
                {13,14}
        };

        System.out.println(Arrays.toString(search(array,6)));
        System.out.println(Arrays.toString(search(array,16)));
        System.out.println(Arrays.toString(search(array,19)));
        System.out.println(Arrays.toString(search(array2,11)));
        System.out.println(Arrays.toString(search(array2,16)));
        System.out.println(Arrays.toString(search(array3,14)));
        System.out.println(Arrays.toString(search(array3,0)));
        System.out.println(Arrays.toString(search(array3,16)));
        int[][] array4={
                {1,2},
                {5,6},
        };
        System.out.println(Arrays.toString(search(array4,5)));
        System.out.println(Arrays.toString(search(array4,7)));
        int[][] array5={
                {1,2,3,4},
                {5,6,7,8},
        };
        System.out.println(Arrays.toString(search(array5,5)));
        System.out.println(Arrays.toString(search(array5,7)));
        System.out.println(Arrays.toString(search(array5,11)));
        System.out.println(Arrays.toString(search(array5,-1)));
    }

    /**
     * Search in the row provided between the cols provided
     *
     * @param matrix
     * @param row
     * @param colStart
     * @param colEnd
     * @param target
     * @return row * col of the target element.
     * if return is -1,-1 then target element is not present.
     */
    public static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    /**
     * @param matrix
     * @param target
     * @return O/P from binarySearch method
     */
    public static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; //be cautious matrix may be empty.

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        //run the loop till 2 rows are remaining
        int rowStart = 0; //Lower bound
        int rowEnd = rows - 1; //Upper bound

        int midCol = cols / 2;

        while (rowStart < (rowEnd - 1)) {//while this is true, it will have more than 2 row.
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (matrix[mid][midCol] == target) {
                return new int[]{mid, midCol};
            }

            if (matrix[mid][midCol] < target) {
                //Ignore the above rows
                rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }

        //Now we have 2 rows.
        //Check whether the target is in the column of the two rows.
        if (matrix[rowStart][midCol] == target) {
            return new int[]{rowStart, midCol};
        }

        if (matrix[rowStart + 1][midCol] == target) {
            return new int[]{rowStart + 1, midCol};
        }
        //otherwise
        //Search in 1st half
        if(target <= matrix[rowStart][midCol-1]){
            return binarySearch(matrix, rowStart, 0, midCol-1, target);
        }
        //Search in 2nd half
        if(midCol+1<cols && target >= matrix[rowStart][midCol+1] &&target <= matrix[rowStart][cols-1]  ){
            return binarySearch(matrix, rowStart, midCol+1, cols-1, target);
        }
        //Search in 3rd half
        if(target <= matrix[rowStart+1][midCol-1]){
            return binarySearch(matrix, rowStart+1, 0, midCol-1, target);
        }else{
            return binarySearch(matrix, rowStart+1, midCol+1, cols-1, target);
        }
    }
}
