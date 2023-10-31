package com.Kamal;

import java.util.Scanner;

public class LargestOf3NosSol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integers to compare the largest one");
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Entered numbers are: "+a+","+b+","+c);
       int max =Math.max(c, Math.max(a,b));
        System.out.println("The largest of 3 numbers : "+max);

        if(max==a){
            System.out.println(max +" max value is found in a("+a+")");
        }
        if(max==b){
            System.out.println(max +" max value is found in b("+b+")");
        }
        if(max==c){
            System.out.println(max +" max value is found in c("+c+")");
        }
    }
}
