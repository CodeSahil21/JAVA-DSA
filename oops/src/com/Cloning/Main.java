package com.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException { //since line 7 throws exception hence we show throws CloneNotSupportedExceptio
        Human Ryan = new Human(24,"Ryan");
       // Human twin = new Human(Ryan);
        Human twin = (Human)Ryan. clone();
        System.out.println(twin.age + " "+ twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;// it will modify twin
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(Ryan.arr)); // it will also modify kunal object too this is shallow copy
        // shallow copy means it will create new copy but not for primitive ex int[] arr contains primitives it will only create copy of variables only



    }
}
