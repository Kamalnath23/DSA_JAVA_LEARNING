package com.Kamal;

import java.util.Scanner;

//find no.of. Even digits Present at given numbers in an array
public class EvenNumberOfDigits2 {
    public static void main(String[] args) {
        System.out.println("Enter the length array");
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();

        System.out.println("Enter array to check out no.of.arrays");
        int[] array = new int[length];
        for (int i = 0; i <= length - 1; i++) {
            array[i] = s.nextInt();
        }

        System.out.println(findNumbers(array));

    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        System.out.println("Total count is " + count);
        return count;
    }

    //fUNCTIONS TO CHECK WHETHER NUM IS EVEN OR NOT
    private static boolean even(int num) {
        if (num < 0) {
            num = num * -1;
        }
        int flag = (int) (Math.log10(num)) + 1; //Number system
        if (flag % 2 == 0) {
            return true;
        }
        return false;
    }
}
