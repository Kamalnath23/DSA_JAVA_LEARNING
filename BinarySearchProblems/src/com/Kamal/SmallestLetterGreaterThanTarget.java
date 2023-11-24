package com.Kamal;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters ={'c','f','j'};
        System.out.println(nextGreatestLetter(letters,'c'));
        System.out.println(nextGreatestLetter(letters,'a'));
        System.out.println( nextGreatestLetter(letters,'z'));
        System.out.println(nextGreatestLetter(letters,'g'));
        System.out.println(nextGreatestLetter(letters,'d'));
    }


    static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end= letters.length -1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else if (target >= letters[mid]) {
                start = mid + 1;
            }
        }
        return letters[start % letters.length ];
    }
}
