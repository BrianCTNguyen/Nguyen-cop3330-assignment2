package oop.assignment2.ex32.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Nguyen
 */

import java.util.Random;
import java.util.Scanner;

public class Solution32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int num, userGuess = 0;
        int counter = 0;

        int gameMode;

        System.out.print("Let's play Guess the Number!\nEnter the difficulty level (1, 2, or 3): ");
        gameMode = in.nextInt();

        if(gameMode == 1) {
            num = random.nextInt(10) + 1;
            System.out.println("I have my number. What's your guess? ");
        }
        else if (gameMode == 2){
            num = random.nextInt(100) + 1;
            System.out.println("I have my number. What's your guess? ");
        }
        else {
            num = random.nextInt(1000);
            System.out.println("I have my number. What's your guess? ");
        }

        while (userGuess != num) {
            userGuess = in.nextInt();

            if (userGuess > num)
                System.out.println("Too high, guess again: ");
            else if (userGuess < num)
                System.out.println("Too low, guess again: ");
        }
        System.out.println("You got it!");
    }
}
