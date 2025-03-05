package org.example.classes.listandnode.Impl;

import org.example.classes.listandnode.LinkedList;
import org.example.classes.listandnode.Node;

public class LinkedListLImpl<T> implements LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public LinkedListLImpl() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public void add(T val) {
        Node<T> newNode = new Node<>(val);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void printElements(){
        Node<T> node = head;
        while(node != null){
            System.out.print(node.getVal() + "---->");
            node = node.getNext();
        }
        System.out.print("null\n");
    }

}
