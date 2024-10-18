package com.statixexample;
// this to show initialisation of static variable
public class StaticInt {
static  int a = 4;
static int b;
static{
    System.out.println("I am in static block");
    b = a * 5;
}

    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b);

     StaticInt.b += 3;
      StaticInt obj2 = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b);
        //staticblock(StaticInt) will only run once when first obj is created ie when class is loaded

    }

}
