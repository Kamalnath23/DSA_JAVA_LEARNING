package com.Kamal;

public class Swap {
    public static void main(String[] args) {
        int a=10, b=20;
        int temp;
        System.out.println("a = "+a+",b ="+b);

        //swap numbers code
        temp =a;
        a=b;
        b=temp;
        System.out.println("After Swap");
        System.out.println("a = "+a+",b ="+b);
    }
}
