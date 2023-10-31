package com.KamalDSA;

import java.util.Scanner;

public class InputsOutputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println(name);

        System.out.println("Enter your marks: ");
        Scanner input2 = new Scanner(System.in);
        float marks = input2.nextFloat();
        System.out.println("Marks: "+marks);
    }
}
