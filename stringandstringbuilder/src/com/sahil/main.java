package com.sahil;

public class main {
    public static void main(String[] args) {
        // what are strings : collection sequence of characters(char ex "sahil" we store it in datatype)
       int[] arr = {2, 4, 5 , 7};// it is saying there is reference variable a pointing towards object at heap memory
        //above example had integer datatype but there is datatype String for letters
        // ie below example has reference variable name which has String datatype
        String name = "Sahil singh";
        System.out.println(name);
    // how does string work internally
        /*
        String name = "sahil singh";
       1) everything starts with capital letters are class ex String is public class String //will be covered in oops
       2) every String we create is object of type String  example at line 8 ie String datatype
       for internal working of string we need to understand 2 concepts
       1) String pool-: a seperate memory structure inside the heap
       it's Usecase is all similar values of string are not recreated in the pool
       hence if we write String b = "Sahil singh", it will not create another "Sahil singh" in heap
       instead it will point towards "Sahil singh" in pool created  for String name which inturn make program more optimized
       but what if out of both reference varaible which are pointing toward same value in pool of heap
       and change is made in one variable will it also modify for other reference variable as well
       ans wile  it will not change  and reason is immutability ie strings are immutable in java
        2)string immutability-:but what if out of both reference varaible which are pointing toward same value in pool of heap
       and change is made in one variable will it also modify for other reference variable as well
       ans wile  it will not change  and reason is immutability ie strings are immutable in java
       reason for that is security reasons

       ex
       string a =  "Sahil singh"
       sout(a)
       a = Singh // here it creates another object in pool ie it is not changing a now is pointing toward singh
       and previous  "Sahil singh" gets through garbage collection
       if there are 10 variable has value "Sahil singh" then there will be only one  "Sahil singh" in pool of heap
       and instead 10 variable will point toward one value createed in pool of heap

         */





    }

}
