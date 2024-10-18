package com.sahil;

public class SHADOWING {
    static int x = 90; // if we intialisesd in this block it will be availed everyone who belong to public class shadow
    // this will be shadow because lower level will overwrite upperlevel ie line 9 overwrite it this means shadowing
    public static void main(String[] args) {

            System.out.println(x);// it will print 90
            int x = 40;// class variable at line 4 is shadow by this and shadowing begins when value is intialised
        // it will not work in method
            System.out.println(x);// it will print 40
            fun();//
        }
        static void fun() {
            System.out.println(x); // it will print 90 because int x = 40 is available to upper block and not fun  block
            //  hence it will print 90 which is available to  whole scope

    }
}



