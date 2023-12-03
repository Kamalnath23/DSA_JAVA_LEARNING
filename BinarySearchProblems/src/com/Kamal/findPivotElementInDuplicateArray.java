package com.Kamal;
//not working well.
public class findPivotElementInDuplicateArray {
    public static void main(String[] args) {
        int[] a ={2,5,6,0,0,1,2};
        int[] b= {2,5,6,0,0,1,2};
        System.out.println(findPivotWithDuplicates(a));
        System.out.println(findPivotWithDuplicates(b));
        System.out.println(a[findPivotWithDuplicates(a)]);
        System.out.println(b[findPivotWithDuplicates(b)]);

        int[] nums={2,9,2,2,2};
        System.out.println(findPivotWithDuplicates(nums));
        System.out.println(nums[findPivotWithDuplicates(nums)]);
    //failed
        int[] nums2={9,2,2,2,3,8};
        System.out.println(findPivotWithDuplicates(nums2));
        System.out.println(nums2[findPivotWithDuplicates(nums2)]);

        int[] nums3={2,3,4,6,9};
        System.out.println(findPivotWithDuplicates(nums3));

        int[] nums4={9,11,1,3,5,8};
        System.out.println(findPivotWithDuplicates(nums4));
    //failed
        int[] nums5={12,19,121,2,2};
        System.out.println(findPivotWithDuplicates(nums5));



        int[] arr={4,5,6,7,0,1,2};
        System.out.println("arr "+ findPivotWithDuplicates(arr));

        int[] arr2={1};
        System.out.println("arr2 "+findPivotWithDuplicates(arr2));

        int[] arr3= {1,2};
        int[] arr4= {3,1,2};
        int[] arr5= {3,4,2};
        int[] arr6= {2,1};
        int[] arr7= {1,2,3};
        System.out.println("arr 3 "+findPivotWithDuplicates(arr3));
        System.out.println("arr 4 "+findPivotWithDuplicates(arr4));
        System.out.println("arr 5 "+findPivotWithDuplicates(arr5));
        System.out.println("arr 6 "+findPivotWithDuplicates(arr6));
        System.out.println("arr 7 "+findPivotWithDuplicates(arr7));

        int arr9[] = {91,93,96,97,3,4,5,11,14,23,47,52,61,69,72,74,81,87,90};
        System.out.println("arr 9 "+findPivotWithDuplicates(arr9));
        System.out.println("arr 9 "+arr9[findPivotWithDuplicates(arr9)]);

        int[] arr10 = {2,4,6,8,10};
        int[] arr11= {9,1,3,5,7};
        System.out.println("arr 10 "+findPivotWithDuplicates(arr10));
        System.out.println("arr 11 "+findPivotWithDuplicates(arr11));
    }
    public static int findPivotWithDuplicates(int[] nums){
        if (nums.length==1){
            return  nums[0];
        }
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid= start+ (end-start)/2;
            //4 cases over here:
            //CASE 1:
            if(mid<end && nums[mid]> nums[mid+1]){
                return mid+1;
            }
            //CASE 2:
            if(mid > start && nums[mid]< nums[mid-1]){
                return mid-1;
            }

            //if elements at mid, start and end are equal, just skip duplicates
            if (nums[mid]==nums[start] && nums[mid]==nums[end]){
                //skip the duplicates
                //Note: what if the elements at start and end are pivot.
                //check if start is Pivot
                if(start<end && nums[start]> nums[start+1]){
                    return start;
                }
                start++;

                //Check whether end is pivot or not
                if(end>start && nums[end]< nums[end-1]){
                    return end-1;
                }
                //if end is pivot, its not rotated BS
                /*
                if(nums[end]> nums[end-1]){
                    return end;
                }
                */
                end--;
                //LS is sorted then Pivot should be in right.
            }else if(nums[start]<nums[mid] || (nums[start]==nums[mid] && nums[mid]>nums[end])){
                start= mid+1;
            }else{
                end=mid-1;
            }

        }
        return -1;
    }
}
