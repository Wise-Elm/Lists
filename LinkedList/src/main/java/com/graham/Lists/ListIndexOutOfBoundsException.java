package com.graham.Lists;

public class ListIndexOutOfBoundsException extends Exception {
    int size, index;

    ListIndexOutOfBoundsException(int size, int index) {
        this.size = size;
        this.index = index;
    }

    public String toString() {
        return "Index (" + index + ") out of range for list size " + size +".";
    }

    public static String getExampleErrorMessage(int size, int index) {
        return "Index (" + index + ") out of range for list size " + size +".";
    }
}
