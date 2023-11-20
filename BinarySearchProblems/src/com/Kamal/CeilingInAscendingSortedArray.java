package com.Kamal;

public class CeilingInAscendingSortedArray {
    public static void main(String[] args) {
        int[] a= {2,4,6,8,10,12,14,16,18,20};
        int[] c = {1,13,45,64,78,91,101};

        System.out.println(CeilingNumberOfAscendingSortedArray(a,7));
        System.out.println(CeilingNumberOfAscendingSortedArray(a,20));
        System.out.println(CeilingNumberOfAscendingSortedArray(a,21));
        System.out.println(CeilingNumberOfAscendingSortedArray(a,0));
        System.out.println(CeilingNumberOfAscendingSortedArray(c,4));
        System.out.println(CeilingNumberOfAscendingSortedArray(c,94));
        System.out.println(CeilingNumberOfAscendingSortedArray(a,1));
        System.out.println(CeilingNumberOfAscendingSortedArray(c,1));
    }

    public static int CeilingNumberOfAscendingSortedArray(int[] array, int target){
        int start=0;
        int end=array.length-1;
        int lengthOfArray = array.length;
        if(array[lengthOfArray-1] < target){
            System.out.println("EXCEPTION: Target is greater than given array of elements");
            return -1;
        }
        while(start<=end){
            int mid= start + (end-start)/2;

            if(target == array[mid]){
                return array[mid];
            }else if(array[mid] < target && array[mid+1]>=target){
                return array[mid+1];
            }
            //Binary search
            if(target<array[mid]){
                end= mid -1;
            }else{
                start = mid + 1;
            }
        }
        System.out.println("EXCEPTION:  Target is lesser than given array of elements");
        return -1;
    }
}
