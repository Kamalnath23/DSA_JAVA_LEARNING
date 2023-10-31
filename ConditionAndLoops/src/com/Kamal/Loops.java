package com.Kamal;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //for loop
        // print numbers from 1 to 5
        System.out.println("print numbers from 1 to 5");
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }

        // print numbers from 1 to n. where n is based on user's input.
        System.out.println("To print a number from 1 to n");
        System.out.println("Enter a number to be input in for loop: ");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println("Numbers from 1 to n("+n+")");
        for(int i=1; i<=n;i++){
            System.out.print(i+ " ");
        }


    }
}
