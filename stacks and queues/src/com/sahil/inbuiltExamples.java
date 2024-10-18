package com.sahil;

import java.util.*;

public class inbuiltExamples {
    public static void main(String[] args) {
        //stacks FILO and LIFO(ie first in last out last in last out and last in first out)
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(44);
        stack.push(54);
        stack.push(64);
        stack.push(74);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
       // System.out.println(stack.pop()); if there is nothing in stack and still it is removed then it shows error
//FIFO and LILO(ie first in first out last in last out and last in last out)
        Queue<Integer>  queue = new LinkedList<>();
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(0);
        queue.add(1);
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());

        Deque<Integer>  deque = new ArrayDeque<>();
        deque.add(12);
        deque.addFirst(14);
        deque.removeFirst();





    }
}
