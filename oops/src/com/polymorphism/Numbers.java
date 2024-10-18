package com.polymorphism;

public class Numbers {
    int sum(int a , int b){
        return a + b ;
    }
  /*  int sum(int a , int b){
        return a + b ;
    }*/
    // here it shows errors because the method is same and allso parameters and arguments are also same
  int sum(int a , int b,int c){// here it does not shows error
      // because the method is same but parameters and arguments are different ex of static or compile time polymorphism
      return a + b + c;
  }

    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.sum(1,3);
        num.sum(1,3,7);
        // at compile time it will know which method is supposed to be run hence it is known as compile time polymorphism
    }
}
