package com.Day5;

import java.util.Scanner;

public class myDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter your second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter the number of your desired operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int operationIndicator = scanner.nextInt();
        int result;
        switch(operationIndicator){
            case 1:
                System.out.println("Result: " + (num1+num2));
                break;
            case 2:
                System.out.println("Result: " + (num1-num2));
                break;
            case 3:
                System.out.println("Result: " + (num1*num2));
                break;
            case 4:
                System.out.println("Result: " + (num1/num2));
                break;
            default:
                System.out.println("Please enter a valid number!");

        }

    }

}
