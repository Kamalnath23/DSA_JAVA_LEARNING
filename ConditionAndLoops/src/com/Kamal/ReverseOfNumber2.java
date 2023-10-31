package com.Kamal;

import java.util.Scanner;

public class ReverseOfNumber2 {
    public static void main(String[] args) {
        System.out.println("REVERSE OF A NUMBER");
        System.out.println("Enter a number to be reverse");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       int n=0;
        while (num>0){
            int r= num%10;
            n = (n*10)+r;
            num=num/10;
        }
        System.out.println("The revers of a given number("+num+") is : "+n);


    }
}
