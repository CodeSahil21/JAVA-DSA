package com.sahil;

import java.util.Scanner;

public class TEMPERATURE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter Temp in c ");

        Float tempc = in.nextFloat();
        Float tempf  =  (tempc * 9/5) + 32;
        System.out.println(tempf);
    }
}
