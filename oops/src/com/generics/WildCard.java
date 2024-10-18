package com.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//here t should be either nimber or its subclasses
public class WildCard<T extends Number> {
    private Object[] data ;
    private static int  DEFAULT_SIZE = 10;
    private int size = 0;
    public WildCard(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void getList(List<? extends Number> list){
    //do something



        // here yon ou can only pass Number type
    }
    public void add(T num){
        if(this.isFULL()){
            resize();
        }data[size++] = num;

    }
    private void resize(){
        Object[] temp =  new Object[data.length*2];
//copy current items in new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];

        }
        data = temp;
    }

    private boolean isFULL(){

        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public int size( ){
        return size;
    }
    public void set(int index,T value){
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
//        for (int i = 0; i < 14; i++) {
//            list.add(2 * i);
//        }
        //       System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();//<Integer> = generics(it is a parameter which chose which type of data to be used)
        list.add(89);//cannot  use primitive data type is arraylist ex int

        CustomGenArrayList<Integer> list3 = new CustomGenArrayList<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }
        System.out.println(list3 );
    }

}
