package org.example.classes.listandnode.nodes;

public class DoubleNode<T>{
    public DoubleNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode<T> prev) {
        this.prev = prev;
    }

    public DoubleNode<T> getNext() {
        return next;
    }

    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public DoubleNode(T val){
        this.next = null;
        this.prev = null;
        this.val = val;
    }

    DoubleNode<T> next;
    DoubleNode<T> prev;
    T val;
}
