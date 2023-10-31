package com.KamalDSA;

import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers which needs to be added.");
        Scanner input = new Scanner(System.in);
        float num1= input.nextFloat();
        float num2= input.nextFloat();
        float sum= num1+num2;
        System.out.println("Sum is "+sum);
    }
}
