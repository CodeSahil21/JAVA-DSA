package com.sahil;



public class REVERSE{
    public static void main(String[] args) {
        int n = 768945;

        int solution = 0;
        while (n > 0) {
            int rem = n % 10;
            n/= 10;

            solution = solution * 10 + rem;
        }
  System.out.println(solution);
    }
}
