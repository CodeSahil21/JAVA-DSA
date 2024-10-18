package com.generics.comparing;

public class Student  implements Comparable<Student>{
    int popularity;

    Float Strength;


    @Override
    public String toString() {
        //return popularity + " ";
        return  Strength + " ";
    }


    public Student(int popularity , Float strength) {
        this.popularity = popularity;
        this.Strength = strength;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println(" inComparetomethod ");
        int diff = (int)(this.Strength - o.Strength);
//        if diff == 0 both are 0 or if diff <  1 means o is bigger
        return diff;
    }
}
