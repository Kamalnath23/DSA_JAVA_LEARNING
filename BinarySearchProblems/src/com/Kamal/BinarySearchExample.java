package com.Kamal;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] a = new int[100000000];
        for(int i=0;i<100000000;i++){
                a[i]=i*2;
        }
        int target= 4194304;
        long startTime= System.currentTimeMillis();
        int ans = searchBinary(a, target);
        long endTime= System.currentTimeMillis();
        System.out.println(ans);
        long elapsedTime= endTime-startTime;
        System.out.println("Elapsed time (BINARY SEARCH): "+elapsedTime+ " ms");

        long startTime2= System.currentTimeMillis();
        int ans2 = LinearSearch(a, target);
        long endTime2= System.currentTimeMillis();
        long elapsedTime2= endTime-startTime;
        System.out.println(ans2);
        System.out.println("Elapsed time (LINEAR SEARCH): "+elapsedTime+ " ms");

    }

    //return the index
    // return -1 if element does not exist
    static int searchBinary(int array[], int target){
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
            return -1;
    }

    static int LinearSearch(int[] arr, int target){
        if(arr.length == 0){
            System.out.println("Array length is equal to 0");
            return -1;
        }
        //run for loop
        for(int index=0; index<arr.length; index++){
            //check for everyelement at index if its equal to target
            int element = arr[index];
            if(element==target){
                System.out.println(target+" is found at index "+index);
                return index;
            }
        }//this line will execute if target is not found in elements. hence this line will execute
        System.out.println("Target not found");
        return -1;
    }
}
