package oop.assignment2.ex29.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Nguyen
 */

import java.util.Scanner;

public class Solution29 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        int r;

        while (true){
            System.out.print("What is the rate of return? ");
            r = in.nextInt();
            if (r >= 1 && r <= 72){
                System.out.println("it will take " + (72/r) + " year to double your initial investment");
                break;
            }
            else {
                System.out.println("Sorry this is not a valid input");
            }
        }
    }
}
