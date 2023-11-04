package com.Kamal;

import java.time.Duration;
import java.time.Instant;

public class ArmStrongNumbersKK {
    public static void main(String[] args) {

        ThreeDigitArmStrongNumber();

    }

    private static void ThreeDigitArmStrongNumber() {
        Instant start = Instant.now();
        System.out.println("Printing 3 digits Armstrong numbers");
        for(int i=100;i<=999;i++){
            int a=i, sum=0;
            while(a>0){
                int rem,cubeOfRem;
                rem = a%10;
                a=a/10;
                cubeOfRem = rem*rem*rem;
                sum= sum+cubeOfRem;
            }
            if( sum == i){
                System.out.println(i);
            }else{
                continue;
            }
        }
        Instant stop = Instant.now();
        Duration timeElapsed = Duration.between(start, stop);
        System.out.println("Time taken:  "+timeElapsed.toNanos()+" nanoSeconds");
    }
}
