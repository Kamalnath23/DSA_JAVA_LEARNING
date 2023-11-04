package com.Kamal;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
    function("a");
    function(78);
    function("Kamal", 24);
    sum(3,7);
    sum(56,78,98);
    fun(1,2,3,4,5,6,7,8,9,10,11);
    fun("Rohit","GILL","VIRAT","SHREYAS","RAHUL","SKY","JADEJA", "SHAMI", "BUMRAH", "KULDEEP", "SIRAJ");
    //fun(); //error:ambiguos
    }
    //method overloading
   //1. Type of argumnent should be different
    //2. Number of argumment can be same unless type is different
    static void function(int a){
        System.out.println(a);
    }

    static void function(String a){
        System.out.println(a);
    }

    static void function(String name, int age){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

    static int sum(int x, int y){
        System.out.println(x+y);
        return x+y;
    }

    static int sum(int x, int y, int z){
        System.out.println(x+y+z);
        return x+y+z;
    }

    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
