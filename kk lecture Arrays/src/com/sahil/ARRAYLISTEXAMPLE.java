package com.sahil;

import java.util.ArrayList;
import java.util.Scanner;

public class ARRAYLISTEXAMPLE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        /*
        ArrayList<datatype> list = new ArrayList<// we can also write datype here but not mandatory>();
         */
        ArrayList<Integer> list = new ArrayList<>(5);

//input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
            
        }
        //to get item at any index we cant do [0] instead we do (list.get(i))
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));// pass index here list[index] syntax will  not work


        }
       // System.out.println(list);

    }

}
