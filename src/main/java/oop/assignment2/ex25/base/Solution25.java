package oop.assignment2.ex25.base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Nguyen
 */

import java.util.Scanner;

public class Solution25 {
    private static final Scanner in = new Scanner(System.in);

    private static String password;

    public static void main(String[] args) {
        readUserInput();

        String output = passwordValidator(password);

        System.out.println(output);
    }

    public static void readUserInput(){
        password = in.next();
    }

    public static String passwordValidator(String password) {

        int digits = 0;
        int symbols = 0;
        int letters = 0;

        String result = "The password '" + password + "' is a ";

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digits++;
            } else if (Character.isLetter(password.charAt(i))) {
                letters++;
            } else {
                symbols++;
            }
        }
        if (password.length() < 8) {
            if (digits == password.length()) {
                result += "very weak password";
            } else if (letters == password.length()) {
                result += "weak password";
            }
        } else {
            if (letters != 0 && digits != 0 && symbols != 0) {
                result += "very strong password";
            } else if (letters != 0 && digits != 0) {
                result += "strong password";
            }
        }
        return result;
    }
}
