package com.Kamal;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number(Integer) to check whether its prime or not: ");
        int n= sc.nextInt();
        System.out.println(n+" is a prime?: "+isPrime(n));
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(n>c){
            if(n%c ==0){
                return false;
            }
            c++;
        }
        if(c*c > n){
            return true;
        }
        return false;

    }
}
