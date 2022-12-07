package com.graham.Demo;


import com.graham.Lists.*;

public class CustomThread extends Thread {

    List target;
    Long id;
    int numberOfNodes;

    public CustomThread(List target, int numberOfNodes) {
        this.target = target;  // List object
        this.numberOfNodes = numberOfNodes;  // Number of nodes to create.
        id = getId();
    }

    public void run() {

        System.out.printf(
                "Thread id: %s, Target: %s, adding %d nodes...\n",
                String.valueOf(this.id),
                this.target,
                numberOfNodes);

        for(int i = 1; i <= numberOfNodes; i++) {
            if(target instanceof LinkedList) {
                ((LinkedList) target).append(i);
            } else if (target instanceof Heap) {
                ((Heap) target).append(i);
            } else if (target instanceof Queue)
                ((Queue) target).add(i);
        }

        System.out.printf(
                "Thread id: %s, Target: %s, deleting nodes...\n",
                String.valueOf(this.id),
                this.target,
                numberOfNodes);

        for(int i = numberOfNodes; i > 0; i--) {
            if(target instanceof LinkedList) {
                ((LinkedList) target).removeAtIndex(i);
            } else if (target instanceof Heap) {
                ((Heap) target).pop();
            } else if (target instanceof Queue)
                ((Queue) target).getNext();
        }

        System.out.printf(
                "Thread id: %s, Target: %s, Finished...\n",
                String.valueOf(this.id),
                target.toString());
    }

    public static void starting(CustomThread thread) {

        System.out.printf(
                "Thread id: %s, Target: %s, Starting...\n",
                String.valueOf(thread.id),
                thread.target);
        thread.start();
    }
}

