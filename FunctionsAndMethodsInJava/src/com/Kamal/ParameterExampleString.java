package com.Kamal;

import java.util.Scanner;

public class ParameterExampleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salution: ");
        String salution = sc.next();
        System.out.println("Enter a morning greeting message");
        Scanner sc2 = new Scanner(System.in);
        String Morninggreetmsg = sc2.nextLine();
        String greet = MorningGreet(salution , Morninggreetmsg);
        System.out.println(greet);
    }

    private static String MorningGreet(String salution, String greet) {
        String MorningGreet = salution+" "+greet;
        return MorningGreet;
    }


}
