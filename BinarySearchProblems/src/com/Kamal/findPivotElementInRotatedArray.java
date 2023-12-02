package com.Kamal;

public class findPivotElementInRotatedArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));

        int[] arr2={1};
        System.out.println(findPivot(arr2));

        int[] arr3= {1,2};
        int[] arr4= {3,1,2};
        int[] arr5= {3,4,2};
        int[] arr6= {2,1};
        int[] arr7= {1,2,3};
        System.out.println(findPivot(arr3));
        System.out.println(findPivot(arr4));
        System.out.println(findPivot(arr5));
        System.out.println(findPivot(arr6));
        System.out.println(findPivot(arr7));

        int arr9[] = {91,93,96,97,3,4,5,11,14,23,47,52,61,69,72,74,81,87,90};
        System.out.println(findPivot(arr9));
        System.out.println(arr9[findPivot(arr9)]);

        int[] arr10 = {2,4,6,8,10};
        int[] arr11= {9,1,3,5,7};
        System.out.println(findPivot(arr10));
        System.out.println(findPivot(arr11));

    }

    //note: this method only works for distinct array not for duplicate array
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
}
