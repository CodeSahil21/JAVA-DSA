package com.sahil;

public class recursion {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        //print first 5 numbers: 1 2 3 4 5
        print(20);
    }
// recursion is a function calling itself
 /*
    if we are said to print one lacs no we cannot create function one lacs times
     */
    static void print(int n){
        if (n == 20) {
            System.out.println(20);
            return;
        }
        System.out.println(n);
        // this is called as tail recursion
        //this is called last function
        print(n + 1);// function ie is calling itself is recursion (recursive call)
        // base condition in recursion - a condition  where our recursion will stop making new calls
        //if you are calling function again and again , you can treat as separate call  in stack
        // ie as many times we call  it will take separate memory in stack
        // when there is no  base condition 1) function calls will keep happening 2) stack will keep getting filled 3) every call takes memory
        //4) it will keep going at one time   memory of computer exceed
        // why do we need recursion
        /*
       1) recursion is function calling itself
      2) recursion helps us in  solving  bigger/complex  problems in simple way
       3) you can covert recursion solution into  iteration(loops) and vice versa
       4) space complexity is not constant due to recursive calls
       5) it helps us breaking down bigger problems in smaller problem

         */
        // visualizing recursion
        /*
        main() // start of program

        print(1)

        print(2)

        print(3)

        print(4)

        print(5)
         */

    }


}

