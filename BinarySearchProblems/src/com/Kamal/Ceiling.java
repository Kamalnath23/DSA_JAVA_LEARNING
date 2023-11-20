package com.Kamal;

public class Ceiling {
    public static void main(String[] args) {
        int[] a= {2,4,6,8,10,12,14,16,18,20};
        int[] c = {1,13,45,64,78,91,101};

        System.out.println(Ceiling(a,7));
        System.out.println(Ceiling(a,20));
        System.out.println(Ceiling(a,21));
        System.out.println(Ceiling(a,0));
        System.out.println(Ceiling(c,4));
        System.out.println(Ceiling(c,94));
        System.out.println(Ceiling(a,1));
        System.out.println(Ceiling(c,1));
    }

    static int Ceiling(int array[], int target){
        int start=0;
        int end =array.length-1;
        int lengthOfArray = array.length;
        if(array[lengthOfArray-1] < target){
            System.out.println("EXCEPTION: Target is greater than given array of elements");
            return -1;
        }
        while(start<=end){
            //FIND THE MIDDLE ELEMENT
            //int mid =(start+end)/2; //might be possible exceeds the range of integer
            int mid = start + (end - start)/2;
            if(target< array[mid]){
                //LHS
                end=mid-1;
            }else  if(target> array[mid]){
                start= mid+1;
            }else{
                return mid;
            }
        }
        return array[start];
    }
}
