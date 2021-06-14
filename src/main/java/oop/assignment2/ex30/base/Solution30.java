package oop.assignment2.ex30.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Nguyen
 */

public class Solution30 {
    public static void main(String[] args)
    {
        for(int r = 1 ; r <= 12; r++)
        {
            for(int c = 1; c <= 12; c++)
            {
                System.out.print(r*c + "\t"); //\t is used to create consistent spaces
            }
            System.out.println();
        }
    }
}
