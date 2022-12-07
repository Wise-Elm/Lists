package com.graham.Lists;


public class Queue extends List {

    public Queue() {
    }

    public void add(int value) {
        // Add node to queue.
        append(value);
    }

    public void append(int value) {
        // Add node to queue.
        super.append(value);
    }

    public int getNext() {
        // Retrieve value and removes next node in queue.
        int value = getHead().getNodeValue();
        setHead(getHead().getNodeNext());

        return value;
    }

    public int getLength() {
        return super.getLength();
    }

    public void deleteQueue() {
        deleteList();
    }
}
