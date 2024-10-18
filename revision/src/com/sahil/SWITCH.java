package com.sahil;

import java.util.Scanner;

public class SWITCH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();

        switch (name) {
            case "Abhay" -> System.out.println("FITNESS KA CHODA");
            case  "Sahilk" -> System.out.println("HOCKEY KA CHODA");
             case  "Aditya" -> System.out.println("BOOK KA CHODA");
             case "ayush" -> System.out.println("HAWAS KA PUJARI");
        }


    }
}
