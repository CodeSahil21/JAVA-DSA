package com.access;

public class Demovalue {

    int num;
   float gpa;
    public Demovalue(int num,float name){
         this.num = num;
         this.gpa = gpa;
    }
    // we will go in detail how  create in hashmap lecture:gives number representation of object
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
     return this.num == ((Demovalue)obj).num;
    }

    /// gives string method
    @Override
    public String toString() {
        return super.toString();
    }
    //gives garbage collection

    @Override
    protected void finalize() throws Throwable {
        super. finalize();
    }

    public static void main(String[] args) {
        Demovalue obj1 = new Demovalue(34,56.9f);
        Demovalue obj2 = new Demovalue(34, 78.9f );
        if(obj1 == obj2){
            System.out.println("object1 is equal object2");
        }
        if(obj1 .equals(obj2)){
            System.out.println("object1 is equal object2");
        }
//        System.out.println(obj1.hashCode());
//        System.out.println(obj.hashCode());
    }
}
