package com.statixexample;
/*class Test{
   static  String name;
    // outside class cannot be static for ex at line 3 if we write static it will show error but inner class can be static
    public Test(String name){
        Test.name = name;
    }
}*/
public class Innerclasses {
    // it will not be used in static because it is static
   /*class Test{
        static  String name;
        // outside class cannot be static for ex at line 3 if we write static it will show error but inner class can be static
    public Test(String name){
            Test.name = name;
        }
    }*/
    //// it can be used in static because it is made  static ie it means it is not depended on the objects of innerclasses
    // since obj are created during run time  and static stuff are not dependent on obj hence it is resolve during compile time
    // if we put static before variable it will same for all cases
  static  class Test{
        static  String name;
        // outside class cannot be static for ex at line 3 if we write static it will show error but inner class can be static
    public Test(String name){
            Test.name = name;
        }
@Override
        public String toString(){
        return name;
        }
    }

    public static void main(String[] args) {
         Test a = new Test("RYAN GOSLING");
        Test b = new Test("LIAM HEMSWORTH");// IT SHOWS ERROR IF WE PUT CLASS TEST IN THE INNERCLASS BECAUSE IT IS NON STATIC
     // WE CANNOT REFERENCE IN MAIN FUNCTION SINCE IT IS  IN STATIC CLASS
        // IT WILL NOT SHOW ERROR WHEN IT IS PUT OUTSIDE THE INNNERCLASS AS A INDIVIUAL CLASS
        System.out.println(a.name);
        System.out.println(b.name);
        // Arrays.toString // arrays is class which contains to String method(function)
        System.out.println(a);//com.statixexample.Innerclasses$Test@30f39991 since a has no toStrinf=g it will write its own to string
    }
}
