package com.access;

public class A {
    //these are data members
 // private  int num;
 public  int num;
   //  protected int num;
  public  String name;
  protected   int[] arr ;

  public int getNum(){
      return num;
  }
  public void setNum(int num){
      this.num = num;
  }

    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];

    }

}
