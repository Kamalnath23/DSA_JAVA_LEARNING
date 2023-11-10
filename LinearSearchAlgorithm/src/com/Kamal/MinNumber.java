package com.Kamal;

public class MinNumber {
    public static void main(String[] args) {
            int[] array = {44,23,-9,-18,23,45,78,0,2,-11,-19,-32,-54,87,10,-101};
        int ans=minimumNumber(array);
        System.out.println(ans);
    }

    static int minimumNumber(int[] a){
        int min=  a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]< min){
                min =a[i];
            }
        }
        return min;

    }
}
