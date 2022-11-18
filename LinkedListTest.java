import org.junit.Test;

import com.graham.LinkedList.LinkedList;

import static org.junit.Assert.*;


public class LinkedListTest {

    public static void main(String[] string) {

        LinkedListTest llt = new LinkedListTest();
        llt.testAppend();
    }

    @Test
    public void testAppend() {
        // Test append.

        LinkedList lst = new LinkedList();

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

        LinkedList lst = new LinkedList();
        lst.append(1);
        assertEquals(1, lst.getHead().getNodeValue());
    }

    @Test
    public void testGetTaid() {
        // Test getTail.

        LinkedList lst = new LinkedList();
        lst.append(1);
        lst.append(2);
        assertEquals(2, lst.getTail().getNodeValue());

    }

    @Test
    public void testGetLength() {
        // Test getLength.

        LinkedList lst = new LinkedList();

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

        LinkedList lst = new LinkedList();

        assertEquals("List is Empty.", lst.getListValues());
        lst.append(1);
        assertEquals("1", lst.getListValues());
        lst.append(2);
        assertEquals("1, 2", lst.getListValues());
        lst.append(3);
        assertEquals("1, 2, 3", lst.getListValues());
    }

    @Test
    public void testSearchValue() {
        // Test LinkedList.searchValues.

        LinkedList lst = new LinkedList();

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

        LinkedList lst = new LinkedList();

        lst.append(1);
        lst.append(2);
        lst.append(3);

        assertTrue(lst.insert(0, 0));
        assertEquals("0, 1, 2, 3", lst.getListValues());

        assertTrue(lst.insert(4, 4));
        assertEquals("0, 1, 2, 3, 4", lst.getListValues());

        assertTrue(lst.insert(1, 5));
        assertEquals("0, 5, 1, 2, 3, 4", lst.getListValues());

        assertTrue(lst.insert(4, 6));
        assertEquals("0, 5, 1, 2, 6, 3, 4", lst.getListValues());

        assertFalse(lst.insert(-1, 7));
        assertEquals("0, 5, 1, 2, 6, 3, 4", lst.getListValues());

        assertFalse(lst.insert(50, 7));
        assertEquals("0, 5, 1, 2, 6, 3, 4", lst.getListValues());
    }

    @Test
    public void testDeleteList() {
        // Test deleteList.

        LinkedList lst = new LinkedList();
        lst.append(1);
        lst.deleteList();
        assertNull(lst.getHead());
    }
}
