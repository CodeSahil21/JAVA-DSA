package com.access;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        A obj = new A(34,"Ryan");
        // We need to do few things
        // 1.access data members
        // 2 modify the dat members

//        ArrayList<Integer> list = new ArrayList<>(23);
//     //   list.DEFAULT_CAPACITY; HERE it shows error because of private access
       // obj.num it shows error because num is private this is known as data hiding
        //we can access private modifiers using get method to get value and setter to set the value
        obj.getNum();// we access private modifier using get method

    }

}
