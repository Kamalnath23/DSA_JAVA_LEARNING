package com.Kamal;

public class MaxNumber {
    public static void main(String[] args) {
            int[] array = {44,23,-9,-18,23,45,78,0,2,-11,-19,-32,-54,87,10,-101};
        int ans=maximumNumber(array);
        System.out.println(ans);
    }

    static int maximumNumber(int[] a){
        int max=  a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]> max){
                max =a[i];
            }
        }
        return max;

    }
}
