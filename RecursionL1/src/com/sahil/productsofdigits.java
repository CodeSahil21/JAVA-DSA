package com.sahil;

public class productsofdigits {
    public static void main(String[] args) {
        int ans = product(1342);
        System.out.println(ans);

    }
    static int product(int n){
        if(n%10 == n){// we cannot use n ==0 because while multiplying it will always gives 0 hence n % 10 = n return n;
            return n;
        }
        return (n%10) * product(n/10);
    }
}
