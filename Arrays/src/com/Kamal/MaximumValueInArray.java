package com.Kamal;

public class MaximumValueInArray {
    public static void main(String[] args) {
        int[] a= {51,12,53,45,45,46,17,98,29};
        System.out.println(maxValueInArray(a));
        System.out.println(maxRange(a, 3, 5));
        System.out.println(maxRange(a, 2, 5));
        System.out.println(maxRange(a, 0, 3));
        System.out.println(maxRange(a, 3, 3));
        System.out.println(maxRange(a, 3, 4));
        System.out.println(maxRange(a, 4, 6));
    }
    private static int maxValueInArray(int[] a){
        if(a.length == 0){
            return -1;
        }
        //assume:
        int maxValueInArray = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]> maxValueInArray){
                maxValueInArray= a[i];
            }
        }
        return maxValueInArray;
    }

    private static int maxRange(int[] a, int startIndexNumber, int endIndexNumber){
        if(endIndexNumber >  startIndexNumber){
            return -1;
        }
        if (a == null) {
            return -1;
        }
        //assume:
        int maxValueInArray = a[startIndexNumber];
        for(int i=startIndexNumber; i<=endIndexNumber; i++){
            if(a[i]> maxValueInArray){
                maxValueInArray= a[i];
            }
        }
        return maxValueInArray;
    }


}
