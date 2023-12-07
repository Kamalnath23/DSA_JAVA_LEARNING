package com.Kamal;

public class BinarySearch2DExample {
    public static void main(String[] args) {
        int[][] a = {
                {18, 9, 12},
                {36, -4, 91},
                {44, 33, 16}
        };
        System.out.println(BinarySearchInMatrices(a,91));
        System.out.println(BinarySearchInMatrices(a,911));
    }

    public static String BinarySearchInMatrices(int[][] Matrix, int target) {
        for (int row = 0; row < Matrix.length; row++) {
            for (int col = 0; col < Matrix[row].length; col++) {
                if (Matrix[row][col] == target) {
                    return "[" + row + "," + col + "]";
                }
            }
        }
        return "Not found";
    }
}
