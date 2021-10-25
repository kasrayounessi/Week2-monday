package com.Day5;

import java.util.Scanner;

public class MyDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Loan Amount: ");
        double loanAmount = scanner.nextDouble();
        System.out.println("Enter Rate of Interest: ");
        double rate = scanner.nextDouble()/1200;
        System.out.println("Enter tenure: ");
        int tenure = scanner.nextInt();

        //double emi = Math.pow((loanAmount * rate * (rate+1)),tenure)/Math.pow((1+rate),(tenure-1));
        double emi = (loanAmount * rate * Math.pow((1+rate),tenure))/(Math.pow((1+rate), tenure)-1);
        double emiRounded = Math.round(emi*100.0)/100.0;

        System.out.println("EMI: " + emiRounded);


    }
}
