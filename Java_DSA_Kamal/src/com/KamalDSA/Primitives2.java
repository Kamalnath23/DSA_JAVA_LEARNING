package com.KamalDSA;

import java.util.Scanner;

public class Primitives2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your roll.no");
        int rollno=input.nextInt();
        System.out.println("Your roll number is : "+rollno);

        int a=10; // 10 - literal;  a- identifer(reference variable)

        // To write money at int
        //Not allowed
        // int billion = 1,00,000,000;
        int billion = 1_00_000_000; //allowed
    }
}
