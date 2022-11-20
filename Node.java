package com.graham.Lists;


/**
A node which can be used to store an integer value and contains a pointer to a possible
next node.
 */
public class Node {

    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public void setNodeValue(int value) {
        // Sets node value.
        this.value = value;
    }

    public int getNodeValue() {
        // Returns node value.
        return this.value;
    }

    public void setNodeNext(Node next) {
        // Sets next node.
        this.next = next;
    }

    public Node getNodeNext() {
        // Returns next node.
        return this.next;
    }

    public void removeNodeNext() {
        // Remove node next
        this.next = null;
    }
}
