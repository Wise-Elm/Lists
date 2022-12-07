package com.graham.Lists;


public class List {

    private Node head;
    private Node tail;

    public List() {
    }

    protected Node getHead() {
        // Return head node.
        return this.head;
    }

    protected void setHead(Node node) {
        // Set head node.
        head = node;
    }

    protected Node getTail() {
        // Return tail node.
        return this.tail;
    }

    protected void setTail(Node node) {
        // Set tail node.
        tail = node;
    }

    protected void append(int value) {
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

    protected int getLength() {
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

    protected int getValueAtIndex (int index) throws ListIndexOutOfBoundsException {
        // Return a value at specified index.
        int lstLen = this.getLength();
        int currentIndex = 0;
        Node currentNode = this.getHead();

        // Account for out of range and empty list.
        if(index < 0 || index > lstLen - 1 || currentNode == null) {
            throw new ListIndexOutOfBoundsException(getLength(), index);
        }

        // Index is 0.
        if(index == 0) {
            return head.getNodeValue();
        }

        // Index > 0.
        while(currentIndex < index - 1) {
            currentNode = currentNode.getNodeNext();
            currentIndex++;
        }

        return currentNode.getNodeValue();
    }

    protected String getAllListValues() {
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

    protected void deleteList() {
        // Delete list.
        this.head = null;
    }

    protected boolean removeAtIndex(int index) throws ListIndexOutOfBoundsException{
        // Remove node at index.
        int lstLen = this.getLength();
        int currentIndex = 0;
        Node currentNode = this.getHead();

        // Account for out of range and empty list.
        if(index < 0 || index > lstLen - 1 || currentNode == null) {
            throw new ListIndexOutOfBoundsException(getLength(), index);
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

        currentNode.setNodeNext(currentNode.getNodeNext().getNodeNext());

        return true;
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

    public boolean searchValue(int value) {
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

    public boolean pop() {
        // Remove node at highest index.
        boolean rtn;

        try {
            rtn = removeAtIndex(getLength() - 1);
        }
        catch (ListIndexOutOfBoundsException exc) {
            // TODO (GS): Add logging for this.
            rtn = false;
        }

        return rtn;
    }
}