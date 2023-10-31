package com.Kamal;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        System.out.println("Enter a alphabet");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if(ch >='a' && ch <='z'){
            System.out.println(ch+" is a Lower case Alphabet");
        }else{
            System.out.println(ch+" is a Upper case Alphabet");
        }
    }
}
