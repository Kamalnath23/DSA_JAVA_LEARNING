package com.Kamal;

public class Scope {
    public static void main(String[] args) {
        int a = 10, b=20;
       //  System.out.println(num); // int num is not accessible
        // int a=97; //error
        a=97;
        String name ="Kamal";
        System.out.println(name);
        //Block Scope
        String n = new String("Rohit");
        String n2 = new String("Gill");
        System.out.println(n+", "+n2);
        n= new String("Ruturaj");
        System.out.println(n+", "+n2);
        {
            //values initialised in this block will remain in this block
            //int a =88; //error - already initialised the block in the same method.
            a=98; // re-assigning original reference to some other value
            System.out.println(a);

            int c=99;
            System.out.println(c);

            name="Raina";
            System.out.println(name);

            System.out.println(n+", "+n2);
            n2="Virat";
            System.out.println(n+", "+n2);
            n= new String("Shreyas");
            System.out.println(n+", "+n2);
        }
        System.out.println(name);
        System.out.println(a);
        //System.out.println(c); //error - cannot outside the block


        //Scoping in for loops
        for(int i=0; i <=4; i++){
            System.out.println(i);
        }
        //System.out.println(i);
        int j=0;
        for(j=0; j<=4; j++){
            System.out.println(j);
        }
        System.out.println(j);
    }

    static void random(int marks){
       // System.out.println(a); // int a is not accessible
        int num = 55;
        System.out.println(num);
        System.out.println(marks);
    }
}
