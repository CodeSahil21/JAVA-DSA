package com.sahil;

public class CircularQueue {
    protected int[] data ;
    private static final int DEFAULT_SIZE = 10;//private no one from outisde can change it and final because i my =self dont want to changeit
    protected  int end = 0;
    protected   int front = 0;
    private int size = 0;
    //when nothing is passed we used default size
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data = new int[size];

    }
    public Boolean isFull(){
        return size == data.length;//means ptr is at last index
    }
    public Boolean isEmpty(){
        return size == 0;// means it is empty
    }
    public Boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;//end++ means first i will do what it wanted to do with end(ie assigning the value)  then it will increment it
        end = end % data.length;
        size++;
        return true;
    }
    public int removed() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    public int front()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }
    public void Display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        int i = front;
        do{
            System.out.print(data[i] + "<-");
            i++;
            i = i % data.length;
        }while(i != end);
        System.out.println("end");
    }

}
