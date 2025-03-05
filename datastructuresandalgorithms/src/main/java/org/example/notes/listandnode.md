# LinkedList and Node Implementation in Java

## Overview
This document provides an overview of a simple generic `LinkedList` implementation in Java. It includes a `Node` class to represent elements in the list and a `LinkedList` class that manages the list structure.

## Node Class
The `Node` class represents an individual element in the linked list.

### Code:
```java
package org.example.classes.listandnode;

public class Node<T> {
    private T val;
    private Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
```

### Description:
- `val`: Stores the value of the node.
- `next`: A reference to the next node in the list.
- Constructor initializes the value and sets `next` to `null`.
- Getter and setter methods are provided for both `val` and `next`.

## LinkedList Class
The `LinkedList` class represents a singly linked list.

### Code:
```java
package org.example.classes.listandnode;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

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

    public void printElements() {
        Node<T> node = head;
        while (node != null) {
            System.out.print(node.getVal() + "---->");
            node = node.getNext();
        }
        System.out.print("null\n");
    }
}
```

### Description:
- `head`: Points to the first node in the list.
- `tail`: Points to the last node in the list.
- Constructor initializes an empty list.
- `add(T val)`: Adds a new node to the end of the list.
- `getHead()`: Returns the head node.
- `getTail()`: Returns the tail node.
- `printElements()`: Prints the elements of the list in order.

## Usage Example
```java
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.printElements(); // Output: 1---->2---->3---->null
    }
}
```

## Conclusion
This implementation provides a simple yet effective way to create and manage a singly linked list using generic types in Java. The `LinkedList` class allows adding elements and printing the list, while the `Node` class manages individual elements.