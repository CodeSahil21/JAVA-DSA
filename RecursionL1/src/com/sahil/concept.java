package com.sahil;

public class concept {
    public static void main(String[] args) {
        fun(5);

    }
    static void fun(int n){
        if(n == 0){
            return ;
        }
        System.out.println(n);
      //  fun(n--);// it will give 5 continuously
      //  fun(--n); it will give 5 to 1 numbers

        //n-- vs --n
        /*
        n-- = pass value of n(5) and then subtract and will keep passing 5
        --n = subtract first and then pass n
         */
    }
}
