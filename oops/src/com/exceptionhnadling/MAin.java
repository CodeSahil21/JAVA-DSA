package com.exceptionhnadling;

public class MAin {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
         //   divide(a,b);throw new Exception("Just for fun");
            String name = "Kunal";
            if(name.equals("Kunal")){
                throw new MyException("name is Kunal");
            }
        }catch(MyException e){//custom exception
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){//if arithmethic expression is thrown it will call this
            System.out.println(e.getMessage());
        }catch(Exception e){  //if exception is called it will call this
            System.out.println("Normal Exception");
        }finally {//since Arithmatic expression is more strict than exception hence we put more strict one above
            System.out.println("this will always execute no matter what ");//finallly can be used only once
        }// try means  try anything in the block but if anything wrong occurs use catch to catch any exception
        
    }
   static int divide(int a,int b) throws ArithmeticException{// we have to declare here whenever we use exception in line 18 for ex
        if (b == 0){
            throw new ArithmeticException("please do not divide by Zero ");
        }
        return a/ b;
    }
}
