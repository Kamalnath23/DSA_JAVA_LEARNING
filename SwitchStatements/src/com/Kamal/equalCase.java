package com.Kamal;

public class equalCase {
    public static void main(String[] args) {
        // example 1
        String a="Kamal";
        String b= "Kamal";
        System.out.println(a == b);
        System.out.println(a.equals(b));

        //example 2
        String c= new String("Nath");
        String d = new String("Nath");
        System.out.println(c==d);
        System.out.println(c.equals(d));
    }
}
