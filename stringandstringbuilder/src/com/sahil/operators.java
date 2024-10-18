package com.sahil;

import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a'+ 'b');
        System.out.println("a"+ "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" +1);
        // this is same as after few steps "a" + 1
        // integer will be converted to integer that will call toString()
        System.out.println("Kunal" +  new ArrayList<>());
        System.out.println("Kunal" + new Integer(56));
     //   System.out.println( new Integer(56) + new ArrayList<>()); it shows error
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);
        // we can use operator overloading in String only
    }
}
