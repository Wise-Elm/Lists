package com.graham.Lists;


/**
A node which can be used to store an integer value and contains a pointer to a possible
next node.
 */
public class Node {

    private int value;
    private Node next;

    protected Node(int value) {
        this.value = value;
        this.next = null;
    }

    protected void setNodeValue(int value) {
        // Sets node value.
        this.value = value;
    }

    protected int getNodeValue() {
        // Returns node value.
        return this.value;
    }

    protected void setNodeNext(Node next) {
        // Sets next node.
        this.next = next;
    }

    protected Node getNodeNext() {
        // Returns next node.
        return this.next;
    }

    protected void removeNodeNext() {
        // Remove node next
        this.next = null;
    }
}

