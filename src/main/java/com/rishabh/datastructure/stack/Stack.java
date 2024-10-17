package com.rishabh.datastructure.stack;

import java.util.ArrayList;

public class Stack<T> { 
    private ArrayList<T> stack;

    public Stack() {
        stack = new ArrayList<>(); 
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(T value) {
        stack.add(value);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack.get(stack.size() - 1);
    }
}
