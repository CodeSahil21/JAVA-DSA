package com.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student Kunal    = new Student(67,30.5f);
        Student Rahul    = new Student(76,70.8f);
        Student Maxtern  = new Student(80,65.7f);
        Student Rajveer  = new Student(85,97.6f);
        Student Rajat    = new Student(87,94.3f);
        Student Elvish   = new Student(94,68.9f);
        Student[] list = {Kunal, Rahul, Maxtern, Rajveer, Rajat, Elvish};
        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return  (int)(o1.Strength - o2.Strength);// by putting - before int we can make
//            }
//        });
        Arrays.sort(list, (o1,o2) -> -(int)(o1.Strength - o2.Strength));            //-> lambda functions





        System.out.println(Arrays.toString(list));



//        if(Kunal.compareTo(Rahul) < 0){
//            System.out.println("Rahul has more marks");
//        }else{
//            System.out.println("Kunal has more marks");
//        }
    }
}
