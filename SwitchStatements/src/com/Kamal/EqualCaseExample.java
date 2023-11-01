package com.Kamal;

import java.util.Scanner;

public class EqualCaseExample {
    public static void main(String[] args) {
        System.out.println("Enter a fruit name: ");
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        if(fruit.equals("Mango")){
            System.out.println("King of fruits");
        }else if(fruit.equals("Apple")){
            System.out.println("A red coloured fruit");
        }else if(fruit.equalsIgnoreCase("Banana")){
            System.out.println("Yellow coloured and elongated shape fruit");
        }else{
            System.out.println("Please enter Mango or Apple");
        }
    }
}
