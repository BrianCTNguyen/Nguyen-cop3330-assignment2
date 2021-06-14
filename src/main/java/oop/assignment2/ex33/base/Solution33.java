package oop.assignment2.ex33.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Nguyen
 */

import java.util.Random;
import java.util.Scanner;

public class Solution33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random randomInt = new Random();

        String question;
        int random = randomInt.nextInt(4) + 1;
        String answer;

        System.out.print("What's your question?\n >");
        question = in.nextLine();

        if (random == 1) {
            answer = "yes";
        } else if (random == 2) {
            answer = "no";
        } else if ( random == 3) {
            answer = "maybe";
        } else {
            answer = "Ask again Later.";
        }
        System.out.println(answer);

    }
}
