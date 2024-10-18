package com.sahil;

public class countnums {
    public static void main(String[] args) {
        int n = 4888568;

        int count = 0;
        while ( n > 0) {
            int rem = n % 10; // n/10 = gives last digit
            if(rem == 8)  {
                count ++;
            }
            n = n/10; // n /=10
        }
System.out.print(count);
    }
}
