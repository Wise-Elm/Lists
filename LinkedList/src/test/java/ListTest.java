package com.graham.Lists;


import org.junit.Test;
import static org.junit.Assert.*;


public class ListTest {

    @Test
    public void testAppend() {
        // Test append.

        List lst = new List();

        // Test append for empty list.
        lst.append(1);
        assertEquals(1, lst.getHead().getNodeValue());
        assertNull(lst.getTail());

        // Test append for list of length one.
        lst.append(2);
        assertEquals(2, lst.getTail().getNodeValue());

        // Test append for list of length greater than one.
        lst.append(3);
        assertEquals(3, lst.getTail().getNodeValue());
    }

    @Test
    public void testGetHead() {
        // Test getHead.

        List lst = new List();
        lst.append(1);
        assertEquals(1, lst.getHead().getNodeValue());
    }

    @Test
    public void testGetTail() {
        // Test getTail.

        List lst = new List();
        lst.append(1);
        lst.append(2);
        assertEquals(2, lst.getTail().getNodeValue());

    }

    @Test
    public void testGetLength() {
        // Test getLength.

        List lst = new List();

        // Test empty list.
        assertEquals(0, lst.getLength());

        // Test list with one node.
        lst.append(1);
        assertEquals(1, lst.getLength());

        // Test list with multiple nodes.
        lst.append(2);
        assertEquals(2, lst.getLength());
        lst.append(3);
        assertEquals(3, lst.getLength());
        lst.append(4);
        assertEquals(4, lst.getLength());
    }

    @Test
    public void testGetListValues() {
        // Test LinkedList.getListValues.

        List lst = new List();

        assertEquals("List is Empty.", lst.getAllListValues());
        lst.append(1);
        assertEquals("1", lst.getAllListValues());
        lst.append(2);
        assertEquals("1, 2", lst.getAllListValues());
        lst.append(3);
        assertEquals("1, 2, 3", lst.getAllListValues());
    }

    @Test
    public void testDeleteList() {
        // Test deleteList.

        List lst = new List();
        lst.append(1);
        lst.deleteList();
        assertNull(lst.getHead());
    }

    @Test
    public void testRemoveAtIndex() throws ListIndexOutOfBoundsException {
        // Test removeAtIndex.

        List lst = new List();
        int badIndex = 6;  // Index for value that will not be made.

        // Attempt to remove from empty list.
        Exception exception = assertThrows(
                ListIndexOutOfBoundsException.class,
                () -> lst.getValueAtIndex(0)
        );
        assertTrue(exception.toString().contains(
                ListIndexOutOfBoundsException.getExampleErrorMessage(
                        0,
                        0
                )
        ));

        for(int i = 1; i < 5; i++) {
            lst.append(i);
        }

        assertEquals("1, 2, 3, 4", lst.getAllListValues());
        assertTrue(lst.removeAtIndex(0));
        assertEquals("2, 3, 4", lst.getAllListValues());


        // Attempt to remove values at indexes that do not exist.
        exception = assertThrows(
                ListIndexOutOfBoundsException.class,
                () -> lst.getValueAtIndex(badIndex)
        );
        assertTrue(exception.toString().contains(
                ListIndexOutOfBoundsException.getExampleErrorMessage(
                        lst.getLength(),
                        badIndex
                )
        ));
        }

    @Test
    public void testGetValueAtIndex() throws ListIndexOutOfBoundsException {
        // Test getValueAtIndex.
        int size;
        int outOfBoundsIndex = 9999;


        List lst = new List();
        for (int i = 1; i < 5; i++) {  // List = 1, 2, 3, 4.
            lst.append(i);
        }
        size = lst.getLength();

        assertEquals(1, lst.getValueAtIndex(0));

        Exception exception = assertThrows(
                ListIndexOutOfBoundsException.class,
                () -> lst.getValueAtIndex(outOfBoundsIndex)
        );

        assertTrue(exception.toString().contains(
                ListIndexOutOfBoundsException.getExampleErrorMessage(
                        size,
                        outOfBoundsIndex
                )
        ));
    }

    @Test
    public void testSearchValue() {
        // Test LinkedList.searchValues.

        List lst = new List();

        lst.append(1);
        lst.append(2);
        lst.append(3);

        assertTrue(lst.searchValue(1));
        assertTrue(lst.searchValue(2));
        assertTrue(lst.searchValue(3));

        assertFalse(lst.searchValue(0));
        assertFalse(lst.searchValue(4));
        assertFalse(lst.searchValue(-1));
    }


    @Test
    public void testInsert() {
        // Test insert.

        List lst = new List();

        lst.append(1);
        lst.append(2);
        lst.append(3);

        assertTrue(lst.insert(0, 0));
        assertEquals("0, 1, 2, 3", lst.getAllListValues());

        assertTrue(lst.insert(4, 4));
        assertEquals("0, 1, 2, 3, 4", lst.getAllListValues());

        assertTrue(lst.insert(1, 5));
        assertEquals("0, 5, 1, 2, 3, 4", lst.getAllListValues());

        assertTrue(lst.insert(4, 6));
        assertEquals("0, 5, 1, 2, 6, 3, 4", lst.getAllListValues());

        assertFalse(lst.insert(-1, 7));
        assertEquals("0, 5, 1, 2, 6, 3, 4", lst.getAllListValues());

        assertFalse(lst.insert(50, 7));
        assertEquals("0, 5, 1, 2, 6, 3, 4", lst.getAllListValues());
    }
}
