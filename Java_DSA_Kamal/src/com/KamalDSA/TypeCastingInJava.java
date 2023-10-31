package com.KamalDSA;

import java.util.Scanner;

public class TypeCastingInJava {
    public static void main(String[] args) {
        //when one type of data assigned to another variable that automatically type conversion take place if the following
        //conditions are met. for eg:
        //CONDITION 1: Destintion type should be greater than source type. In int you can add only int value, whereas in float you can add either float or int value.
        System.out.println("Type Casting.");
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);

        //Converting integer to float is called as type casting. Casting in compatible times


        //Narrowing conversion float --> int
        //eg:
        int z = (int) (67.57f);
        System.out.println(z);

        //Automatic type promotion in expression
        int a=2570;
        byte b= (byte)(a); //257 % 256 = 1
        System.out.println(a+","+b);

        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f=  (c*d) /e; // c*d = 2000 which exceeds byte a lot. here it automatically update
        System.out.println("f : "+f);

       // c=(byte)(c*2);

        int number = 'A'; //AASCAR VALUES
        System.out.println(number);

        System.out.println("வணக்கம்");
        System.out.println("こんにちは");


        // RULES FOR TYPE PROMOTION:
        //Rule 1: All the short, byte and char values are promoted to integer. If any one of the operand is long, then whole operstion promoted to long
        System.out.println(3*7.2);




    }
}
