package oop.assignment2.ex31.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Nguyen
 */

import java.util.Scanner;

public class Solution31 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        int restingHR,age;

        System.out.print("Resting Pulse: ");
        restingHR = in.nextInt();

        System.out.print("Age: ");
        age = in.nextInt();

        int intensity = 55;
        System.out.println("Intensity\t| Rate ");
        System.out.println("------------------------");

        while(intensity<96){
            int TargetHeartRate = (((220 - age) - restingHR) * intensity) + restingHR;
            System.out.println(intensity+"% \t\t| "+TargetHeartRate +"bpm");
            intensity += 5;
        }
    }
}
