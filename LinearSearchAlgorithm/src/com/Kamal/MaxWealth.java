package com.Kamal;

public class MaxWealth {
    public static void main(String[] args) {
        int a[][]={
                {7,8,9},
                {21,1,1},
                {9,9,4,5,6,8},
                {3,2,11}
        };

        System.out.println(maximumwealth(a));
    }


static int maximumwealth(int[][] accounts){

        int maxSum=0;
        for(int person = 0; person< accounts.length;person++){
            int sum=0;
            for (int account=0; account< accounts[person].length ; account++){
                    sum += accounts[person][account];
            }
            if(sum>maxSum) {
                 maxSum= sum;
            }
        }
        return maxSum;
    }
}
