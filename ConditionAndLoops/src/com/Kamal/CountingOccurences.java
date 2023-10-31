package com.Kamal;

import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {

        System.out.println("COUNTING OCCURENCES IN A NUMBER");
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        //1385757879
        System.out.println("Enter the number to calculate the no.of.times its repeating in a above number");
        Scanner sc2 = new Scanner(System.in);
        char n = sc2.next().charAt(0);

        int num = number.length();
        int count=0;
        for(int i=0; i<num-1; i++){
            if(number.charAt(i) == n){
                count++;
            }
        }
        System.out.println(n+" is repeatd "+count+" times in a given number "+number);

    }
}
