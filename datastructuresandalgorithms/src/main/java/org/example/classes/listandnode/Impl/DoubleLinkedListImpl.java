package org.example.classes.listandnode.Impl;

import org.example.classes.listandnode.ReversibleList;
import org.example.classes.listandnode.nodes.DoubleNode;

public class DoubleLinkedListImpl<T> implements ReversibleList<T> {
    public DoubleNode<T> getHead() {
        return head;
    }

    public void setHead(DoubleNode<T> head) {
        this.head = head;
    }

    public DoubleNode<T> getTail() {
        return tail;
    }

    public void setTail(DoubleNode<T> tail) {
        this.tail = tail;
    }

    DoubleNode<T> head;
    DoubleNode<T> tail;

    public DoubleLinkedListImpl(){
        this.head = null;
        this.tail = null;
    }
    @Override
    public void add(T val) {
        DoubleNode<T> newNode = new DoubleNode<>(val);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
        }
        tail = newNode;
    }

    @Override
    public void printElements(){
        DoubleNode<T> front = head;
        DoubleNode<T> back = tail;
        while(front != null){
            System.out.print(front.getVal() + "--->");
            front = front.getNext();
        }
        System.out.print("null");
    }

    public void printReverse() {
        DoubleNode<T> back = tail;
        while (back != null) {
            System.out.print(back.getVal() + " <--- ");
            back = back.getPrev();
        }
        System.out.println("null");
    }




}
