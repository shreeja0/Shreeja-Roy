package com.company.JavaCalculator;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int result= 0;
        String operation = "";

        System.out.print("enter the first num:");
        Scanner n = new Scanner(System.in);
        num1 = n.nextInt();
        System.out.println("enter operation: + - * /");
        operation = n.next();
        System.out.println("enter the second num");
        num2 = n.nextInt();


        switch (operation) {
            case "+":
                result = num1 + num2;

                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;

                default:
                System.out.println(" enter the valid operation");


        }
         System.out.println(" the result of num1  " + result + "    and num2: + result");







        }



	// write your code here
    }

