package com.rishabh.datastructure.queue;

import com.rishabh.datastructure.linkedlist.LinkedList;

public class Queue<T> {
    private LinkedList<T> linkedList;

    public Queue() {
        linkedList = new LinkedList<>();
    }

    public void enqueue(T value) {
        linkedList.add(value);
    }

    public T dequeue() {
        if (linkedList.isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        T value = linkedList.get(0);
        linkedList.remove(value)
        return value;
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public int size() {
        return linkedList.size();
    }

    public void display() {
        linkedList.display();
    }
}
