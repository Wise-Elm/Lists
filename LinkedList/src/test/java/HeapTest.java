package com.graham.Lists;


import org.junit.Test;

import static org.junit.Assert.*;


public class HeapTest {

    @Test
    public void testGetTopValue() {
        // Test getTopValue.

        Heap heap = new Heap();

        for(int i = 0; i < 5; i++) {
            heap.append(i);
            assertEquals(heap.getTopValue(), i);
        }
    }
}
