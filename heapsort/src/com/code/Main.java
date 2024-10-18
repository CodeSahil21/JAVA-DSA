package com.code;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        Heaps<Integer>  heap = new Heaps<>();
        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);

//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
        ArrayList list =  heap.heapsort();
        System.out.println(list);

    }
}
