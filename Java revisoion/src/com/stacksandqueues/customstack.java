package com.stacksandqueues;

public class customstack {
    //internally it has an array justlike linkedlist has head and tail
    protected int[] data;
    private  static final int DEFAULT_SIZE = 10;
    public customstack(){
        this(DEFAULT_SIZE);
    }
    int ptr = -1;
    public customstack(int size){
        this.data = new int[size];
    }
    public boolean push(int value){
        if(isfull()){
            System.out.println("Stack is full");
        }
        ptr++;
        data[ptr] = value;
        return true;



    }
    public boolean isfull(){
        return ptr == data.length-1;
    }
    public boolean isempty(){
        return ptr == -1;
    }
}
