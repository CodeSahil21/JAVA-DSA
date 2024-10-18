package com.sahil;

import java.sql.SQLOutput;

public class Scoping {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        String name = "Sahil Singh";
        random(45);

        {
            // int a = 60; already intialised in the outside block in same method hence cannot be intialised again
            a = 100; // reassign the origin ref variable to some other one (modifiy)
            System.out.println(a);
            name = "Aryan singh";
            System.out.println(name);
            int c = 30;
         //   values intialised in this  will remain in the same block
        }
     //   System.out.print(c); // cannot be use outside block
        System.out.println(a);
        System.out.println(name);

        // scoping for loop : anything intialised in for loop will remain in for loop
        for(int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;

        }
     // *  // System.out.print(i);// anything intialised outside the block can be used inside  the block
     // *  // but anything intialised inside the block cannot be intialised outsisde the block
       //* // anything intialised outside the block cannot be intialised inside  the block but can be used to update or modify inside the block
    }
    static void random(int marks) {
    int num = 67;
    //'    System.out.print(a);// we cant acess another function in this function hence it will show  error
    System.out.println(num);
        System.out.println(marks); // also chanes will be  valid in their respective function
    }
}







