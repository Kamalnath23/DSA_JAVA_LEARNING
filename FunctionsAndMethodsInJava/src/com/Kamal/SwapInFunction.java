package com.Kamal;

import java.util.Scanner;

public class SwapInFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to swap");
        int a =sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a = "+a+",b ="+b);
        swap(a,b);
        //System.out.println("a = "+a+",b ="+b); //it did not swapped


    }

    static void swap(int x, int y){
        //swap numbers code
        int temp;
        temp =x;
        x=y;
        y=temp;
        System.out.println("After Swap");
        System.out.println("a = "+x+",b ="+y);
        //Note: this change is only vaid in this function scope only.
    }
}
