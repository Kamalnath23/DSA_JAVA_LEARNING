package com.Kamal;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        //Syntax
        //Array: collection of data type of a single varibale.
        /*
        datatype[] variablename = new datatype[sizw];
         */
        String b =null;
        System.out.println(b);

        //short data = null;


        int[] rollNos = new int[5];
        int[] rollNos2 = {1,2,3,4,5};

        int[] a; //declaration of array. 'a' is getting defined in the stack.
        a = new int[5]; //Initialization. Actually here object is being created in the heap memory.

        for(int i =0; i<a.length; i++){
            a[i]= i;
        }
        System.out.println(Arrays.toString(a));
    }
}
