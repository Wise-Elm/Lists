package com.graham.Lists;

public class Heap extends List {

    public static void main(String[] string) {
    }

    public Heap() {
    }

    public boolean pop() {
        // Pop element from top of heap.

        if(this.tail == null) {
            return false;
        } else {
            int len = this.getLength() - 1;
            return removeAtIndex(len);
        }
    }

    public int getTopValue() {
        // Return top element value.

        if(this.getLength() == 1) {
            return this.head.getNodeValue();
        } else {
            return this.tail.getNodeValue();
        }
    }
}
