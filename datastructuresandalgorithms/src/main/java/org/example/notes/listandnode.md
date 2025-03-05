# Linked List Implementations

## Overview
This project contains implementations of singly and doubly linked lists in Java, with their corresponding node structures and interfaces.

## Files and Their Roles

### 1. **Node.java**
- Represents a node in a singly linked list.
- Stores a value and a reference to the next node.
- Contains getter and setter methods.

### 2. **DoubleNode.java**
- Represents a node in a doubly linked list.
- Stores a value, a reference to the next node, and a reference to the previous node.
- Contains getter and setter methods.

### 3. **LinkedList.java** (Interface)
- Defines a generic linked list structure.
- Methods:
    - `add(T val)`: Adds a new node with the given value.
    - `printElements()`: Prints the elements of the list.

### 4. **ReversibleList.java** (Interface)
- Extends `LinkedList.java` to include reverse printing functionality.
- Methods:
    - `printReverse()`: Prints the elements in reverse order.

### 5. **LinkedListLImpl.java** (Singly Linked List Implementation)
- Implements `LinkedList.java`.
- Uses `Node.java` to represent elements.
- Methods:
    - `add(T val)`: Adds a new node to the end of the list.
    - `printElements()`: Prints the list elements sequentially.
    - Getters for `head` and `tail`.

### 6. **DoubleLinkedListImpl.java** (Doubly Linked List Implementation)
- Implements `ReversibleList.java`.
- Uses `DoubleNode.java` to represent elements.
- Methods:
    - `add(T val)`: Adds a new node to the end of the list.
    - `printElements()`: Prints the list elements sequentially.
    - `printReverse()`: Prints the list elements in reverse order.
    - Getters and setters for `head` and `tail`.

## Usage
- Use `LinkedListLImpl` for singly linked list operations.
- Use `DoubleLinkedListImpl` for doubly linked list operations, including reverse traversal.
- Both implementations support dynamic addition and printing.

## Future Enhancements
- Add deletion methods.
- Implement search functionality.
- Optimize memory usage where necessary.

