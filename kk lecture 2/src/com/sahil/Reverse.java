package com.sahil;



public class Reverse {
    public static void main(String[] args) {
        /*
        answer will be same as fibonachi  only new step
        will add = eg 7*10 + 9 = 79, 79 *10 + 8  = 798
         */
   int num = 78905;

   int ans = 0;
   while (num > 0) {
       int rem =  num % 10;
       num /= 10;

       ans = ans * 10 + rem;
   }
        System.out.print(ans);
    }
}
