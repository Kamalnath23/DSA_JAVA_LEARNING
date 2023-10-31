package com.Kamal;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Take input from user till user does not press x or X.
        int ans=0;
        while (true){
            //take the operator as input.
            System.out.println("Enter the operator: ");
            char op = sc.next().trim().charAt(0);
            if(op == '+'||op == '-' ||op == '*' ||op =='/' || op =='%'){
                //Input 2 numbers
                System.out.println("Enter 2 numbers");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println();
                if(op == '+'){
                    ans=num1 + num2;
                }else if(op == '-'){
                    ans = num1 - num2;
                }else if(op == '*'){
                    ans = num1*num2;
                }else if(op =='/' ){
                    if(num2 != 0){
                        ans= num1/num2;
                    }else{
                        System.out.println("Undefined!");
                        break;
                    }

                }else if(op =='%'){
                    if(num2!=0){
                        ans= num1%num2;
                    }else{
                        System.out.println("Undefined!");
                        break;
                    }

                }
                System.out.println(ans);
            } else if (op== 'x' || op=='X') {
                break;
            }else{
                System.out.println("Invalid Operation.");
            }
        }

    }

}
