package com.quest;

import java.util.Stack;

public class validparantheses {
    public boolean isValid(String n){
        Stack<Character> stack = new Stack<>();

        for(char ch:n.toCharArray()){
            if(ch == '(' || ch == '{'||ch == '['){
                stack.push(ch);
            }else{
                if(ch == ')'){
                    if(stack.pop() != '('||stack.isEmpty()){
                        return false;
                    }
                }
                if(ch == '}'){
                    if(stack.pop()!='{'||stack.isEmpty()){
                        return false;
                    }
                }
                if(ch == ']'){
                    if(stack.pop() != '['|| stack.isEmpty()){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
