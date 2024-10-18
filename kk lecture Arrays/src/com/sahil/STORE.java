package com.sahil;

public class STORE {
    public static void main(String[] args) {
        // Q : store a roll no
        int a = 19;
        // Q : store a persons name
        String name = " Sahil Singh";

        // Store 50 roll no // we cant write 50 numbers so we use Arrays : collection of datatypes
        /*
        *Syntax
        datatype[] variable name = new datatype(size);
         */
        // Q : Store 5 roll no
        int[] rollnos = new int[5];// rollnos is refernce variable
        //or we can directly write
        int[] roolnos2 = {1 , 2 , 45 , 56, 78};// dataype means type of data array will contain
        // ex if we write string datatype then array ,must contain string only

        int[] ros; // declaration of array. ros is getting defined n stack
        ros = new int[5]; // intialisation : actually object is being created in the memory(heap)
     //   System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]); // this will show null
    }
}
