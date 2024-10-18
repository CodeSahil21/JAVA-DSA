package com.statixexample;

public class human {

        int age;
        String name;
        int salary;
        boolean married;
         static long population;
         static  void message(){
             System.out.println("Hello World!");
         }

        public human(int age, String name,int salary,boolean married){
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.married = married;
            human.population += 1; // in order to access static variable we have class name (Ex human) instead of this keyword
        }


}
