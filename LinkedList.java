package com.graham.LinkedList;


public class LinkedList {

    private Node head = null;
    private Node tail = null;

    public static void main(String[] string) {
    }

    public LinkedList() {

    }

    public void append(int value) {
        // Empty list.
        if (this.head == null) {
            this.head = new Node(value);

            // Only one node.
        } else if (this.tail == null) {
            Node node = new Node(value);
            head.setNodeNext(node);
            this.tail = node;

            // More than one node.
        } else {

            // Advance node.
            Node node = this.head;

            while (node.getNodeNext() != null) {
                node = node.getNodeNext();
            }
            Node newNode = new Node(value);
            node.setNodeNext(newNode);
            this.tail = newNode;
        }
    }

    public Node getHead() {
        // Return head node.
        return this.head;
    }

    public Node getTail() {
        // Return tail node.
        return this.tail;
    }

    public int getLength() {
        // Return list length.
        int len = 0;

        // Blank list.
        if (this.head == null) {
            return len;
        }

        // Increment list length.
        Node node = this.head;
        len++;
        while (node.getNodeNext() != null) {
            len++;
            node = node.getNodeNext();
        }

        return len;
    }

    public String getListValues() {
        // Return string representation of list values.

        StringBuilder values = new StringBuilder();

        int len = this.getLength();

        // Empty list.
        if (len == 0) {
            values = new StringBuilder("List is Empty.");
            return values.toString();

            // One node in list.
        } else if (this.head != null && this.tail == null) {
            values.append(head.getNodeValue());
            return values.toString();

            // More than one node in list.
        } else {
            Node node = this.head;
            values.append(head.getNodeValue());
            do {
                values.append(", ").append(node.getNodeNext().getNodeValue());
                node = node.getNodeNext();
            } while (node.getNodeNext() != null);

            return values.toString();
        }
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

    public void deleteList() {
        this.head = null;
    }
}
