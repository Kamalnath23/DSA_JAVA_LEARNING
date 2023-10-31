package com.Kamal;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        System.out.println("REVERSE OF A NUMBER");
        System.out.println("Enter a number to be reverse");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       int n=0;
        while (num>0){
            int r= num%10;
            n = r;
            num=num/10;
            System.out.print(n);
            //System.out.print("Reverse of a number("+num+") is "+n);
        }


    }
}
