package com.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4 ,9,8);
      //  Box box2 = new Box(box1);
       // System.out.println(box1.l +" " + box1.h + " "+ box1.w);

      //  Boxweight box3 = new Boxweight();
      //  Boxweight box4 = new Boxweight(2 ,3,4,5);
        box1.getL();//we can acees private variabkes using getclass even though it is private we can access it this is known as data hiding

       // System.out.println(box4.l+"\n"+box4.h+ "\n"+box4.w+"\n"+box4.weight);

       // Box box5 = new Boxweight(2, 4 ,5 ,8);
     //   System.out.println(box5.l+"\n"+box5.h+ "\n"+box5.w+"\n"+box5.weight);
        // there are many variables in both parent and child class
        //you are given access to variables that are of ref type ie Boxweight
        // hence, you should have access to eight variable
        //this also means one you are trying access should also be initialised
        // but here object itself is of type  parent class how will you call constructor
      //  Boxweight box6 = new Box(2 ,4 ,5);// base does not know or access variables of child class
      //  System.out.println(box6);
        // here weight shows error because the number or arguments which can be acesses depends on tyoe of reference variable not the object
        // argument(weight) will be initialised but shows error while printing
        // here Box is reference variable is Box class and Boxweightis object
      //  Boxprice box = new Boxprice(2,3,4,5);
     //box1.greeting();
        Box box = new Boxweight();
       box.greeting();// obj from parent claas will aways no what matter how you call it will not override in child class
        // static method can be inherited but cannot be  override

    }
}
