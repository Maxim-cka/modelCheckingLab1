package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter string");
        String string = myObj.nextLine();  // Read user input
        if (check(string)) {
            System.out.println("String is a number");
        } else {
            System.err.println("String is not a number");
        }
    }

    private static boolean check(String string) {
        boolean wasPointMeet = false;
        boolean isNumberExist = false;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= '0' && string.charAt(i) <= '9') {
                isNumberExist = true;
            } else if (string.charAt(i) == '.' && !wasPointMeet) {
                wasPointMeet = true;
            } else {
                return false;
            }
        }

        return isNumberExist;
    }
}
