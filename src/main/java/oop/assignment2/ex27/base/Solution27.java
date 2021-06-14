package oop.assignment2.ex27.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Nguyen
 */

import java.util.Scanner;

public class Solution27 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String firstName;
        String lastName;
        int zip;

        System.out.print("Enter the first name: ");
        firstName = in.next();

        System.out.print("Enter the last name: ");
        lastName = in.next();

        System.out.print("Enter the ZIP code: ");
        zip = in.nextInt();

        System.out.println("There were no errors found.");


    }
}
