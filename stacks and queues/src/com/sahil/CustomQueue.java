package com.sahil;

public class CustomQueue {
    protected int[] data ;
    private static final int DEFAULT_SIZE = 10;//private no one from outisde can change it and final because i my =self dont want to changeit
    //when nothing is passed we used default size
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    int end = 0;
    public CustomQueue(int size){
        this.data = new int[size];

    }
    public Boolean isFull(){
        return end == data.length;//means ptr is at last index
    }
    public Boolean isEmpty(){
        return end == 0;// means it is empty
    }
    public Boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;//end++ means first i will do what it wanted to do with end(ie assigning the value)  then it will increment it
        return true;
    }
    public int removed() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[0];
        //shift the elements to left
        for (int i = 1; i <end ; i++) {
            data[i-1] = data[i];//previous is equal to next
        }
        end--;
        return removed;
    }
    public int front()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }
       public void Display(){
           for (int i = 0; i < end; i++) {
               System.out.print(data[i] + " ");
           }
           System.out.print("End");
       }

}
