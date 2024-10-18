package com.sahil;

public class factorial {
    public static void main(String[] args) {
           int ans = fact(5);
        System.out.println(ans);
    }

    static int fact(int n){
        if(n <= 1){// base condition
            return 1;
        }

        return n * fact(n - 1);// function is int type hence we return it
    }
}
