package com.graham.Lists;


public class LinkedList extends List {

    public static void main(String[] string) {
    }

    public LinkedList() {
    }

    public Boolean searchValue(int value) {
        // Return true if value found, false otherwise.

        Node node = this.head;

        while (node != null) {
            if (node.getNodeValue() == value) {
                return true;
            } else {
                node = node.getNodeNext();
            }
        }
        return false;
    }

    public boolean insert(int index, int value) {
        // Insert value into list at index. Return true if possible, false otherwise.

        int currentIndex = 0;
        int lstLen = this.getLength();
        Node currentNode = this.getHead();

        // Index 0.
        if (index == 0) {
            Node newNode = new Node(value);
            this.head = newNode;
            newNode.setNodeNext(currentNode);
            return true;
        }

        // Index out of range.
        if (index >= lstLen) {
            // Insert at tail.
            if (index == lstLen) {
                Node newNode = new Node(value);
                this.tail.setNodeNext(newNode);
                this.tail = newNode;
                return true;
                // Index is too large (index > lstLen + 1).
            } else {
                return false;
            }

            // Index < 0.
        } else if (index < 0) {
            return false;

            // Index within range of list.
        } else {
            //Index within range.
            Node newNode = new Node(value);
            while (currentIndex < index - 1) {
                currentNode = currentNode.getNodeNext();
                currentIndex++;
            }
            // Insert new node.
            newNode.setNodeNext(currentNode.getNodeNext());
            currentNode.setNodeNext(newNode);
            return true;
        }
    }
}
