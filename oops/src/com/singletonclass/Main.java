package com.singletonclass;


import com.access.A;

public class Main   {
    public static void main(String[] args) {
      //  Singleton obj = new Singleton();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
      //  all three varaibles are referencing towards one object
      //  obj.num// it cannot acess it simce it is private
        //public means you can access it anywhere
        A a = new A(34,"Ryan");
        a.getNum();
     int  n =   a.num; // if we remove public from it , it will sow error
        // if we do not declare public ie default variable    it will not be available for all packages
        // if we declare public  then it will be available to package outsides one to
        // protected  only subclass can accces the members of protected class outside the package


    }


}
