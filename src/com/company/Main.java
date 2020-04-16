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

    static boolean check(String buffer) {
        int state = 1;
        for (int i = 0; i < buffer.length(); i++) {
            if (state == 1 && isNumber(buffer.charAt(i))) {
                state++;
            } else if (state == 2 && buffer.charAt(i) == '.') {
                state++;
            } else if (state == 3 && isNumber(buffer.charAt(i))) {
                state++;
            } else if ((state == 2 || state == 4) && isNumber(buffer.charAt(i))) {
            } else {
                return false;
            }
        }

        return state == 4;
    }

    static boolean isNumber(char symbol) {
        return symbol >= '0' && symbol <= '9';
    }
}
