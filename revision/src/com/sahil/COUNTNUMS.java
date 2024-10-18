package com.sahil;

public class COUNTNUMS {
    public static void main(String[] args) {
        int n = 588698;

        int count = 0;
        while (n > 0) {
            int rem = n%10; // % use this for remainder
            if (rem == 8) {
                count++;
            }
            n = n/10;

        }
        System.out.println(count);
    }
}
