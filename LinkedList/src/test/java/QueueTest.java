package com.graham.Lists;


import org.junit.Test;

import static org.junit.Assert.*;


public class QueueTest {

    @Test
    public void testGetNext() {
        // Test getNext.

        Queue queue = new Queue();

        for(int i = 1; i < 5; i++) {
            queue.add(i);
        }

        for(int i = 1; i < 5; i++) {
            assertEquals(i, queue.getNext());
        }
    }

    @Test
    public void testAdd() {
        // Test add.

        Queue queue = new Queue();

        for(int i = 1; i < 5; i++) {
            queue.add(i);
        }
        assertEquals("1, 2, 3, 4", queue.getAllListValues());
    }
}
