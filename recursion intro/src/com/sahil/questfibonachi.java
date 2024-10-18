package com.sahil;

public class questfibonachi {
    public static void main(String[] args) {
        // to check whether question can be solved via recursion
      //  1) break it down into smaller problems
         // 2) find recurence relation ie when we write recursion in formula
             // 3) base condition is represented by answers we  already have
        // above case fibo(0) = 0 and fibo(1) = 1 this is base condition
     //   for (int i = 0; i <11 ; i++) {
     //       System.out.println(fiboformula(i));
       // }
        System.out.println(fiboformula(10));

    }

    static int fiboformula(int n){
        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2 ), n) / Math.sqrt(5));

    }

    static int fibo(int n) {
        // base condition
        if(n < 2){ // if n = 0 and n = 1
            return n;
        }
        // this is not tail recursion due  to extra step  of return and addition
        return fibo(n - 1) + fibo(n - 2);
    }
}
// how to understand and approach recursion problem
/*
1) identify if you can break down problem into smaller problem
2) write the recurrence relation if needed
3) draw the recursive tree
4)about the tree:
* see the flow of function, how they are getting in stack
*identify and focus on left tree calls and right  tree call
ex above for fibo(4) out of fibo(3){left} and fibo(2){right}  the first to execute
untill and unless left is not finished executing  right will not begin
* draw the tree  and pointer again and again using pen and paper
* use the debugger to see the flow of program
5) see how the values are return  at each step and see where function call will come out from , in the end you will come out from main function

 */