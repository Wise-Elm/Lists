package com.graham.Lists;


public class LinkedList extends List {
    final int ERROR_VALUE = -9999;

    public LinkedList() {
    }

    public int getValueAtIndex(int index) {
        int value;

        try {
            value = super.getValueAtIndex(index);
        } catch (ListIndexOutOfBoundsException exc) {
            // TODO (GS): Add logging for this.
            value = ERROR_VALUE;
        }
        return value;
    }

    public void append(int value) {
        super.append(value);
    }

    public String getAllListValues() {
        return super.getAllListValues();
    }

    public boolean insert(int index, int value) {
        return super.insert(index, value);
    }

    public boolean removeAtIndex(int index) {
        boolean rtn;

        try {
            rtn = super.removeAtIndex(index);
        } catch (ListIndexOutOfBoundsException exc) {
            // TODO (GS): Add logging for this.
            rtn = false;
        }
        return rtn;
    }

    public boolean searchValue(int value) {
        return super.searchValue(value);
    }

    public int getLength() {
        return super.getLength();
    }

    public void deleteLinkedList() {
        deleteList();
    }
}
