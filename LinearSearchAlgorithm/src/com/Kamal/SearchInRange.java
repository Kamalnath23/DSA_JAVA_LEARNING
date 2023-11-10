package com.Kamal;

import java.util.Arrays;

public class SearchInRange {
    public static void main(String[] args) {
        //String name= "Kamalnath";
        int[] arr= {17,21,18,96,48,2,31,23,45,7,10};
        int ans= linearSearch(arr, 23,0,7);
        System.out.println(ans);
        int ans2= linearSearch(arr, 7,7,10);
        System.out.println(ans2);
        int ans3= linearSearch(arr, 7,10,7);
        System.out.println(ans3);
        int ans4= linearSearch(arr, 48,0,5);
        System.out.println(ans4);

        int[] a= {};
        int ans5= linearSearch(a, 48,0,5);
        System.out.println(ans5);
    }

    static int linearSearch( int[] a, int target, int start, int end){
        if(a.length==0){
            System.out.println("Lengtth of Array is Zero!");
            return -1;
        }
        if(start>end){
            System.out.println("End index " +end+ " should not be less than start index: "+start+".");
            return -1;
        }
            for(int i=start; i<=end; i++){
                int data = a[i];
                if(target==data){
                    System.out.println(target+" is found at the index:"+i +" in the array "+ Arrays.toString(a) +" between the start index: "+start+" and end index: 0"+end);
                    return data;
                }
            }
        System.out.println("Target Data("+target+") is not found in the array "+Arrays.toString(a) +" between the start index: "+start+" and end index: 0"+end);
            return -1;

    }
}
