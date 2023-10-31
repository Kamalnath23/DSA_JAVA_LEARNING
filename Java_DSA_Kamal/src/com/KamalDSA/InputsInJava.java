package com.KamalDSA;

import java.util.Scanner;

public class InputsInJava {
    public static void main(String[] args) {
        System.out.println(); //Standard Output stream prints. here print something.
        System.out.println("Enter an Integer below:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Entered integer is "+ a);


        System.out.println("Enter a message below:");
        Scanner input2 = new Scanner(System.in);
        String msg = input2.nextLine();
        System.out.println("The message is: "+msg);

    }
}
