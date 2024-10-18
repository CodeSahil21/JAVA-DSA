package com.abstractclasses;

public class daughhter extends  Parent {

    public daughhter(int age){
        super(age);
    }
    @Override
    void career(){
        System.out.println("I am going to  be a doctor " );
    }

    @Override
    void partner(){
        System.out.println("I love ");
    }

}
