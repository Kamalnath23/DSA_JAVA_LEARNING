package com.Kamal;

public class Shadowing {
    static int x; //class variable
    public static void main(String[] args) {
        System.out.println(x);
        x=100;
        System.out.println(x);
        int x;
        //System.out.println(x); //error: scope will being when initialisation is made,
        x=140;
        System.out.println(x); //shadowing : at lower level over-riding the upper level
        //class variable at line 4 is shadowed at above line.
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
