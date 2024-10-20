package com.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class customArraylist {
    private int[] data ;
    private static int  DEFAULT_SIZE = 10;
    private int size = 0;
    public customArraylist(){
       this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(this.isFULL()){
             resize();
        }data[size++] = num;

    }
    private void resize(){
        int[] temp =  new int[data.length*2];
//copy current items in new array
        for (int i = 0; i < data.length; i++) {
            temp[i] =data[i];

        }
        data = temp;
    }

    private boolean isFULL(){

        return size == data.length;
    }
   
public int remove(){
        int removed = data[--size];
        return removed;
}
public  int get(int index){
        return data[index];
}
public int size( ){
        return size;
}
public void set(int index,int value){
        data[index] = value;
}

    @Override
    public String toString() {
        return "CustomArrayList{"+
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
    customArraylist list = new customArraylist();
        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();//<Integer> = generics(it is a parameter which chose which type of data to be used)
        list.add(89);//cannot  use primitive data type is arraylist ex int


    }
}
