package com.Kamal;

import java.util.ArrayList;
import java.util.Scanner;

public class InputArrayList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an Array List (in terms of int)");
        ArrayList<Integer> list = new ArrayList<>(5);

        //Input //list.size() --> always false
        for(int i=0; i<5;i++){
            list.add(s.nextInt());
        }

        //Output 1
        System.out.println("O/P 1");
        System.out.println(list);

        //Output 2
        System.out.println("O/P 2");
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i));
            System.out.print(" ");
        }
    }
}
