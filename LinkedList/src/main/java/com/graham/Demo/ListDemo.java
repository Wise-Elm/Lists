package com.graham.Demo;

import com.graham.Lists.*;


public class ListDemo {

    private long startTime = 0;
    private static final int numberOfNodes = 10000;

    public static void main(String[] args) {

        LinkedList linked_list = new LinkedList();
        Heap heap = new Heap();
        Queue queue = new Queue();

        List[] lists = {linked_list, heap, queue};
        CustomThread[] threads = new CustomThread[3];

        for(int i = 0; i < lists.length; i++) {
            CustomThread thread = new CustomThread(lists[i], numberOfNodes);
            threads[i] = thread;
        }

        for(CustomThread thread : threads) {
            CustomThread.starting(thread);
        }
    }
}
