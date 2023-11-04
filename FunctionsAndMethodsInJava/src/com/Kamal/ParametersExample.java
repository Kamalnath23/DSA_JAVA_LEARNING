package com.Kamal;

public class ParametersExample {
    public static void main(String[] args) {
        int sumOfTwoNumbers = sum(20,15);
        System.out.println(sumOfTwoNumbers);
    }

    static int sum(int a, int b){
    int sum;
    sum= a+b;
        System.out.println(a+"+"+b+"="+sum);
    return sum;
    }
}
