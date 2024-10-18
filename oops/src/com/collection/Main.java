package com.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Collection
       List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list2.add(34);
        list2.add(78);
        list2.add(54);
        list2.add(69);
        System.out.println(list2);
        List<Integer> Vector = new Vector<>();
        Vector.add(34);
        Vector.add(78);
        Vector.add(54);
        Vector.add(69);
        System.out.println(Vector);//prefer arraylist since it is more faster  compare to vector


    }
}
