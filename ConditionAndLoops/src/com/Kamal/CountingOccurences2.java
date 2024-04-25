package com.Kamal;

import java.util.Scanner;

public class CountingOccurences2 {
    public static void main(String[] args) {

        System.out.println("COUNTING OCCURENCES IN A NUMBER");
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int permanent=number;
        //1385757879
        System.out.println("Enter the number to calculate the no.of.times its repeating in a above number");
        Scanner sc2 = new Scanner(System.in);
        int num = sc2.nextInt();
        int count =0;
        while(number>0){
            int rem = number%10;
            if(rem == num){
                count++;
            }
            number=number/10;
        }
        System.out.println(num+" is repeatd "+count+" times in a given number "+permanent);

    }
}
