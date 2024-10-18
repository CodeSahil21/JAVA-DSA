package com.sahil;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch =  in.next().trim().charAt(0);

        /*
        trim() = remove extra spaces e
        charAt(0) = selects alpahbets at index no 0 eg : hello : charAt(0) means letter H
        && = and , || = or, ==equal, != =not equal to
         */

        if (ch >= 'a' && ch <= 'z' ) {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }

    }
}



