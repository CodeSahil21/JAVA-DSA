package com.sahil;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(4);
//        queue.insert(3);
//        queue.insert(2);
//        queue.insert(0);
//        queue.insert(1);
//       queue.Display();
//        System.out.println();
//       queue.removed();
//        queue.Display();
        CircularQueue queue = new CircularQueue(5);
        queue.insert(4);
        queue.insert(3);
        queue.insert(2);
        queue.insert(0);
        queue.insert(1);
        queue.Display();
        System.out.println();
        queue.removed();
        queue.insert(133);
        queue.Display();
    }
}
