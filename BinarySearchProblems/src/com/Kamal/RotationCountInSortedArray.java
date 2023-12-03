package com.Kamal;

public class RotationCountInSortedArray {
    public static void main(String[] args) {
        int k[]={4,5,6,7,8,9,0,1,2,3};
        System.out.println(rotationCount(k));
            int[] arr ={15,18,2,3,6,12};
        System.out.println(rotationCount(arr));

        int[] arr3= {1,2};
        int[] arr4= {3,1,2};
        int[] arr5= {3,4,2};
        int[] arr6= {2,1};
        int[] arr7= {1,2,3};
        System.out.println(rotationCount(arr3));
        System.out.println(rotationCount(arr4));
        System.out.println(rotationCount(arr5));
        System.out.println(rotationCount(arr6));
        System.out.println(rotationCount(arr7));
    }
    public static int findPivot(int[] array){
        if(array.length==1){
            return 0;
        }
        int start=0;
        int end= array.length-1;

        while(start<=end){
            int mid = start +(end-start)/2;
            //Case 1:
            if(mid<end && array[mid]> array[mid+1]){
                return mid;
            }
            //case 2:
            if(mid>start && array[mid]< array[mid-1]){
                return mid-1;
            }
            if (array[mid] <= array[start]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }

    public static int rotationCount(int[] array){
        int pivot=findPivot(array);
        if(pivot==-1){
            return 0;
        }
        return pivot+1;
    }
}
