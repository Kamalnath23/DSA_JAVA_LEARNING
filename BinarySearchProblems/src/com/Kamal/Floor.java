package com.Kamal;

public class Floor {
    public static void main(String[] args) {
        int[] a= {2,4,6,8,10,12,14,16,18,20};
        int[] c = {1,13,45,64,78,91,101};

        System.out.println(Floor(a,7));
        System.out.println(Floor(a,20));
        System.out.println(Floor(a,21));
        System.out.println(Floor(a,0));
        System.out.println(Floor(c,4));
        System.out.println(Floor(c,94));
        System.out.println(Floor(a,1));
        System.out.println(Floor(c,1));
    }

    static int Floor(int array[], int target){
        int start=0;
        int end =array.length-1;

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
        return array[end];
    }
}
