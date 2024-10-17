package com.rishabh.datastructure.linkedlist;

public class LinkedList<T> {
    private Node head;
    private int size;

    class Node {
        private T value;
        private Node next;

        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(T value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public boolean remove(T value) {
        if (head == null) {
            return false;
        }
        if (head.value.equals(value)) {
            head = head.next;
            size--;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.value.equals(value)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }
}
