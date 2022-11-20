package com.graham.Lists;

public class List {

    Node head;
    Node tail;

    public static void main(String[] string) {
    }

    public List() {
    }

    public Node getHead() {
        // Return head node.
        return this.head;
    }

    public Node getTail() {
        // Return tail node.
        return this.tail;
    }

    public void append(int value) {
        // Empty list.
        if (this.head == null) {
            this.head = new Node(value);

            // Only one node.
        } else if (this.getLength() == 1) {
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

    public void deleteList() {
        // Delete list.
        this.head = null;
    }

    public boolean removeAtIndex(int index) {
        // Remove node at index.
        int lstLen = this.getLength();
        int currentIndex = 0;
        Node currentNode = this.getHead();

        // Account for out of range and empty list.
        if(index < 0 || index > lstLen - 1 || currentNode == null) {
            return false;
        }

        // Index is 0.
        if(index == 0) {
            this.head = this.head.getNodeNext();
            return true;
        }

        // Index > 0.
        while(currentIndex < index - 1) {
            currentNode = currentNode.getNodeNext();
            currentIndex++;
        }

        // Reassign tail if needed.
        if(currentNode.getNodeNext() == this.tail) {
            this.tail = currentNode;
        }

        currentNode.next = currentNode.getNodeNext().getNodeNext();

        return true;
    }
}
