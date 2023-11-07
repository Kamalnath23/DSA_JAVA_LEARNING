package com.Kamal;

import java.util.Arrays;
import java.util.Scanner;

public class InputArrayOfObjects {
    public static void main(String[] args) {
        System.out.println("Enter an array data (in terms of String.)");
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];

        for(int i=0; i< str.length;i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        //Modify
        str[1]= "Son Goku";
        System.out.println(Arrays.toString(str));

    }
}
