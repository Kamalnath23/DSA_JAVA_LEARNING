package com.Kamal;

import java.util.Scanner;

public class LargestOf3Nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integers to compare the largest one");
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Entered numbers are: "+a+","+b+","+c);
        int max=a; //assumption
        if((max>b) || (max==b)){

        }else if(b>max){
           max=b;
        }
        System.out.println(max);
        if(c>max || c == max){
            max=c;
        }
        System.out.println("The largest of 3 numbers : "+max);
    }
}
