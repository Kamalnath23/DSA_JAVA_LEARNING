package com.Kamal;

import java.util.Scanner;

public class FibonacciExample {
    public static void main(String[] args) {
        System.out.println("FIBONACCI SERIES");
        System.out.println("Please enter a number to get series of FIBONACCI NUMBER");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0,b=1,c,i;
        System.out.print(a+" "+b);
        for(i=2; i<=n;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }

    }
}
