package com.graham.Lists;


public class Queue extends List {

    public Queue() {
    }

    public void add(int value) {
        // Add node to queue.
        this.append(value);
    }

    public int getNext() {
        // Retrieve value and remove next node in queue.
        int value = this.head.getNodeValue();
        this.head = this.head.getNodeNext();

        return value;
    }
}
