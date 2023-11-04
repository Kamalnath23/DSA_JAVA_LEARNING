package com.Kamal;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        int AdditionOfTwoNumbers = sum2();
        System.out.println(AdditionOfTwoNumbers);
    }

    //print the value
    static void sum(){
        int n1,n2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        n1 = sc.nextInt();
        System.out.println("Enter Second number");
        n2 = sc.nextInt();
        sum = n1+n2;
        System.out.println("Addition of entered numbers: "+n1+"+"+n2+" = "+sum);
    }

    //return the value
    static int sum2(){
        int n1,n2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        n1 = sc.nextInt();
        System.out.println("Enter Second number");
        n2 = sc.nextInt();
        sum = n1+n2;
        System.out.println("Addition of entered numbers: "+n1+"+"+n2+" = "+sum);
        return sum;
    }
}
