package com.lec1;

public class objects {
    public static void main(String[] args) {
        //student[] Student = new Student[5];
      // Student kunal;// declaration
        //all class object in java must be allocated dynamically
        // memory allocated during runtime is known as dynamic memory allocation
        // left side occurs at compile time and right side occurs during runtime
        Student ryan = new Student(51,"SAHIL SINGH",89.7f);// new is use to allocate memory at run time
        // here student() is constructor - A constructor basically defines what happens when the object is created
      //  ryan.name = "SAHIL SINGH";
      //  ryan.rollno = 51;
      //  ryan.marks = 87.9f;// int float put f at last
        System.out.println(ryan.name);
        System.out.println(ryan.rollno);
        System.out.println(ryan.marks);
        // constructor is a special function that runs when you create an object and it allocates some variable
       // ryan.greeeting();
       // ryan.changename("shoe lover");
       // ryan.greeeting();
        Student random = new Student();
        // we don't use new with primitive datatype because in java primitive are treated as object which are stored in stack
        // it leads to make java a efficient language
        Student one = new Student();
        Student two = one;
        one.name = "Something Something";
        System.out.println(two.name);
    }
}
class Student {
    int rollno;// variables declared inside a class is known as instance variable
    String name; // we can acess instance variable using . operator
    float marks;// ex sout(Student1.rollno);

    void greeeting(){
        System.out.println("HELLO MY NAME IS " + this.name);
    }
      void changename(String newname){
        name = newname;
      }


    // syntax to create constructor
    Student(){
       //this how you call a constructor from another constructor
        //internally it is   Student(12,"default person",100.0f);
        this (12,"default person",100.0f);
    }



    //Student arpit= new student(17, Arpit singh,89.7f);
    // here, this will be relaced by arpit
    // constructor don't have return type
    Student(int rollno,String name,float marks){
        // we need aa way to add the values of the above properties object by object
        // we need one word to acess every object(use this keyword )
        // here this will be replaced by name of reference variable
        // if the variable of class and constructors are same then use  this.
        this.name =  name ;
        this.rollno = rollno;
        this.marks = marks;// int float put f at last
    }


}
