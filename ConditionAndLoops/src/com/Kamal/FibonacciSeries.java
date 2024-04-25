package com.Kamal;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        //Q. fIND NTH FIBONACCI NUMBER
        System.out.println("FIBONACCI SERIES");
        System.out.println("Please enter a number to get value for NTH FIBONACCI NUMBER");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0, b =1;
        int count = 2;
        while(count <=n){
            int temp = b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println("Value for n("+n+")th in Fibonacci series is "+b);
    }
}
