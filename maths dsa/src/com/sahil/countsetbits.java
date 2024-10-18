package com.sahil;

public class countsetbits {
    public static void main(String[] args) {
        int n = 45;

        System.out.println(Integer.toBinaryString(n));// you see binary form
        System.out.println(setbits(n));
    }
    private static  int setbits(int n){
        int count = 0;

        while(n > 0){
            count++;
            n -= (n & -n);
        }

        return count;
    }
}
