package com.sahil;

public class CustomStack {
    protected int[] data ;
    private static final int DEFAULT_SIZE = 10;//private no one from outisde can change it and final because i my =self dont want to changeit
   //when nothing is passed we used default size
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    int ptr = -1;//initially ptr value will be zero because no item is inserted
    public CustomStack(int size){
        this.data = new int[size];

    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++; //ptr moves forward
        data[ptr] = item;
        return true;
    }
    public int pop ()throws StackException{
        if(isEmpty()){
           throw new StackException("Cannot be popped from Empty array");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
//        or
        return data[ptr--];
    }
    public int peek()throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot be popped from Empty array");
        }
        return data[ptr];
    }

    public Boolean isFull(){
        return ptr == data.length-1;//means ptr is at last index
    }
    public Boolean isEmpty(){
        return ptr == -1;// means it is empty
    }


}
