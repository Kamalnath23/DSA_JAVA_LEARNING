package com.Kamal;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    //when we don't know how many inputs we are giving.
    public static void main(String[] args) {
            fun(1,2,3,4,5);
            fun(101,201,301,401,501);
            multiple(20,20,"A","B","B","C","D","E","ROHIT","GILL","VIRAT","SHREYAS","RAHUL","SKY","JADEJA");
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    //note: VarArg parameter must be last in the list
    static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }

}
