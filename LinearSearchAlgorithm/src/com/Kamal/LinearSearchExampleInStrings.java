package com.Kamal;

public class LinearSearchExampleInStrings {
    public static void main(String[] args) {
        String name = "Kamalnath";
        char target = 'l';
        boolean b = SearchCharInString(name, target);
        System.out.println(b);

        boolean b2 = SearchCharInString("Sandhiya", target);
        System.out.println(b2);
    }



    static boolean SearchCharInString( String str, char target){
        if(str.length()==0){
            System.out.println("String has no characters");
            return false;
        }
        for(int i=0; i<str.length()-1; i++){
              if(str.charAt(i) == target){
                  System.out.println("Character "+str.charAt(i)+" is found at index "+i+" "+"in given string "+str +".");
                  return true;
              }
        }
        System.out.println("Char "+target+" is not found in given string "+str +".");
        return false;
    }
}
