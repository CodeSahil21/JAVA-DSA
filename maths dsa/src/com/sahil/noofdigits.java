package com.sahil;

public class noofdigits {
    public static void main(String[] args) {
        int n = 34567;
        int b = 10; // base

        int ans = (int)(Math.log(n) / Math.log(b)) + 1; // int(log^n with base b )+ 1

        System.out.println(ans);
    }
}
