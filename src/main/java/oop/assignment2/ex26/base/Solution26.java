package oop.assignment2.ex26.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Nguyen
 */

import java.util.Scanner;

public class Solution26 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        double b = readBalance();
        double apr = readAPR();
        double p = readP();

        PaymentCalculator calculator = new PaymentCalculator();

        double n = calculator.calculateMonthsUntilPaidOff(b, apr, p);

        System.out.println("It will take you " + n + " months to pay off this card.");
    }

    private static double readBalance(){
        double b;
        System.out.print("What is your balance? ");
        b = Double.parseDouble(in.next());
        return b;
    }

    private static double readAPR() {
        double apr;
        System.out.print("What is the APR in the card (as a percent)? ");
        apr = Double.parseDouble(in.next());
        return apr;
    }

    private static double readP(){
        double p;
        System.out.print("What is the monthly payment you can make? ");
        p = Double.parseDouble(in.next());
        return p;
    }
}
