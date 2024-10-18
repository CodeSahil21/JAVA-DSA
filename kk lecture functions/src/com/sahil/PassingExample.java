package com.sahil;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Sahil Singh"; // we can write any string like name chacha etc
        greet(name);
        
    }
    static void greet(String naam ) {  // we cannot write string chachha here because
      System.out.println(naam); //  we are internally goona swap it by string chacha which happens internally
    }

}
