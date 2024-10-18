package com.sahil;

public class nto1 {
    public static void main(String[] args) {
            funRev(5);
    }
    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    static void funRev(int n){
        if(n == 0){
            return;
        }
        funRev(n-1);// basic idea is once it has finished executig it will come from here then print
        System.out.println(n);
    }
}
