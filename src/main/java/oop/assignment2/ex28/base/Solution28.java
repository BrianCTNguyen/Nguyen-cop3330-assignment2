package oop.assignment2.ex28.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Nguyen
 */

import java.util.Scanner;

public class Solution28 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        int n;
        while(count <6){
            System.out.print("Enter a number: ");
            n = in.nextInt();
            sum += n;
            count++;
        }
        System.out.println("The total is " + sum + ".");
    }

}
