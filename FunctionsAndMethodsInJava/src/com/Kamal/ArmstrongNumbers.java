package com.Kamal;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        //print all 3 digits armstrong numbers
        int start = Instant.now().getNano();
       ThreeDigitArmStrongNumber();
        int stop = Instant.now().getNano();
        System.out.println(start+" "+ stop);
        int timeElapsed = stop - start;
        System.out.println("Time taken:  "+timeElapsed+" nanoSeconds");
    }

    private static void ThreeDigitArmStrongNumber() {
        System.out.println("Printing 3 digits Armstrong numbers");
        for(int i=100;i<=999;i++){
            //int temp =i;
            int a = i%10;
            int x= i/10;
            int b = x%10;
            int y= x/10;
            int c= y%10;
            int z= ((a*a*a)+(b*b*b)+(c*c*c));
            if( z== i){
                System.out.println(i);
            }else{
                continue;
            }
        }
    }
}
