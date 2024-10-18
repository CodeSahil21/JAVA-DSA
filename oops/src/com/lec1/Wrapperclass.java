package com.lec1;

public class Wrapperclass {
    public static void main(String[] args) {
        //int a = 10;
       // Integer num =  45;
        // in wrapper class we convert character into an object
        // final int increase = 2;

        Integer  a = 10;
        Integer b = 20;

        swap( a, b);
        System.out.println(a + " "+ b);
       // final int bonus = 3;
        //bonus = 4; here it shows error because using final keyword we cannot that variable
       final  A kunal = new A("SAHIL SINGH");
       kunal.name = "other name";
       // when non primitive is final ,you cannot reassign it
    //   kunal = new A("new object");
        A obj;
        for (int i = 0; i < 1000000000; i++) {
            obj = new A("random name");
            
        }

    }
    static  void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
        System.out.println(a + " "+ b);
    }
}
class A{
 //  final int num;// alway initialised while declare it
    // you can only not make changes in primitive datatype only
    final int num = 20;
    String name;
    public A(String name){
       // System.out.println("object created");
        this.name =  name;
    }
// garbage collection : Whenever any object of cass A is free from the memory this will be called


    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}


