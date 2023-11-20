package com.Kamal;

public class FloorInAscendingSortedArray {
    public static void main(String[] args) {
        int[] a= {2,4,6,8,10,12,14,16,18,20};
        int[] c = {1,13,45,64,78,91,101};

        System.out.println(FloorNumberOfAscendingSortedArray(a,7));
        System.out.println(FloorNumberOfAscendingSortedArray(a,20));
        System.out.println(FloorNumberOfAscendingSortedArray(a,21));
        System.out.println(FloorNumberOfAscendingSortedArray(a,0));
        System.out.println(FloorNumberOfAscendingSortedArray(c,4));
        System.out.println(FloorNumberOfAscendingSortedArray(c,94));
        System.out.println(FloorNumberOfAscendingSortedArray(a,1));
        System.out.println(FloorNumberOfAscendingSortedArray(c,1));
        System.out.println(FloorNumberOfAscendingSortedArray(c,102));
    }

    public static int FloorNumberOfAscendingSortedArray(int[] array, int target){
        int start=0;
        int end=array.length-1;
        int lengthOfArray = array.length;
        while(start<=end){
            int mid= start + (end-start)/2;
            if(array[lengthOfArray-1] < target){
                System.out.println("EXCEPTION: Target is greater than given array of elements");
                return -1;
            }
            if(target == array[mid]){
                return array[mid];
            }else if(array[mid] < target && array[mid+1]>target){
                return array[mid];
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
