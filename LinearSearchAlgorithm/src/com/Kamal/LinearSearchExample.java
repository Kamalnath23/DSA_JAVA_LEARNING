package com.Kamal;

public class LinearSearchExample {
    public static void main(String[] args) {
            int nums[] = {23,45, 1,2,17,18,-98,-11,3,0,69, 56};
            int target = 69;
            int ans = LinearSearch(nums, target);
        System.out.println(ans);
    }

    //search in the array: return index if the item foubd
    //other return -1, if item not found

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
