package com.Kamal;

import java.util.Scanner;

public class NestedSwitchStatement {
    public static void main(String[] args) {
        System.out.println("Enter a Employee ID AND Department name");
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String dept = sc.next();

        switch (empID){
            case 1:
                System.out.println("Kakashi");
                break;

            case 2:
                System.out.println("Kamal");
                break;

            case 3:
                System.out.println("Robot");
                switch (dept){
                    case "IT":
                        System.out.println("Information Technology Department");
                        break;
                    case "cera":
                        System.out.println("Depart of Cermaic Technology");
                        break;
                    default:
                        System.out.println("Department not found or invalid");
                        break;
                }

            default:
                System.out.println("Enter correct emp ID");
                break;
        }
    }
}
