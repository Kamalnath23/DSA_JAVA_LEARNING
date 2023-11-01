package com.Kamal;

import java.util.Scanner;

public class switchStatements {
    public static void main(String[] args) {
        System.out.println("Enter a fruit name: ");
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Banana" -> System.out.println("A yellow colored elangated fruit");
            case "Orange" -> System.out.println("Orange colored round fruit");
            case "Grapes" -> System.out.println("Small and violet colored fruit");
            default -> System.out.println("Enter Apple or Banana or Mango or Orange or Grapes");
        }
    }
}
