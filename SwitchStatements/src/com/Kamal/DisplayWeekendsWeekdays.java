package com.Kamal;

import java.util.Scanner;

public class DisplayWeekendsWeekdays {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1-7 to display days");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Please enter value from 1 to 7");
        }
    }
}
