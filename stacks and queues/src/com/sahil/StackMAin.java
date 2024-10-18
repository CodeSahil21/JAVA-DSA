package com.sahil;



public class StackMAin {
    public static void main(String[] args) throws Exception {
//  CustomStack stack = new CustomStack(5);
//  stack.push(23);
//        stack.push(33);
//        stack.push(43);
//        stack.push(53);
//        stack.push(63);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
       dynamicstack stack = new dynamicstack(5);
        stack.push(34);
        stack.push(44);
        stack.push(54);
        stack.push(64);
        stack.push(74);
        stack.push(84);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
