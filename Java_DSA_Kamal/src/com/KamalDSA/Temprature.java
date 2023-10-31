package com.KamalDSA;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the temperature in degree Celcius:");
        float celciusTemprature = in.nextFloat();

        float farenheitTemprature = ((celciusTemprature*9)/5)+32;

        System.out.println("Farenheit temperature = "+farenheitTemprature +"°F"+"\n"+"Where Celcius temperature = "+celciusTemprature+"°C");
    }
}
