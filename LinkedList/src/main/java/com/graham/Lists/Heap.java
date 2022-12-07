package com.graham.Lists;


public class Heap extends List {

    public Heap() {
    }

    public void append(int value) {
        super.append(value);
    }

    public boolean pop() {
        return super.pop();
    }

    public int getTopValue() {
        // Return top element value.



        if(this.getLength() == 1) {
            return getHead().getNodeValue();
        } else {
            return getTail().getNodeValue();
        }
    }

    public int getLength() {
        return super.getLength();
    }

    public void deleteHeap() {
        deleteList();
    }
}
