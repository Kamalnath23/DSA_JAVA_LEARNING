package com.Kamal;

import java.util.Arrays;

public class SearchCharInRangeString {
    public static void main(String[] args) {
        String name= "Kamalnath";
        Boolean ans = SearchInRange(name,'a',0,1);
        System.out.println(ans);
        Boolean ans2 = SearchInRange(name,'K',0,8);
        System.out.println(ans2);
        Boolean ans3 = SearchInRange(name,'h',1,9);
        System.out.println(ans3);
        Boolean ans4 = SearchInRange(name,'z',0,8);
        System.out.println(ans4);



    }

    static  Boolean SearchInRange(String s, char target, int start, int end){
        System.out.println("Length of String : "+s.length());
        if(s.length() ==0){
            System.out.println("String size is zero");
            return false;
        }
        int index;
        for(index=start;index<=end;index++){
            if(target == s.charAt(index)){
                System.out.println(target+ " is found at the index "+index+" in the given string "+s+ " between the indexes "+start+" and "+end);
                return true;
            }

        }
        System.out.println(target+ " is not found at the given string "+s+ " between the indexes "+start+" and "+end);
        return false;
    }
}
