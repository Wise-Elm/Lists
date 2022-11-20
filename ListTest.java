import com.graham.Lists.List;
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

        assertEquals("List is Empty.", lst.getListValues());
        lst.append(1);
        assertEquals("1", lst.getListValues());
        lst.append(2);
        assertEquals("1, 2", lst.getListValues());
        lst.append(3);
        assertEquals("1, 2, 3", lst.getListValues());
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
    public void testRemoveAtIndex() {
        // Test removeAtIndex.

        List lst = new List();
        assertFalse(lst.removeAtIndex(0));  // Empty list should return false.

        for(int i = 1; i < 5; i++) {
            lst.append(i);
        }
        assertFalse(lst.removeAtIndex(6));
        assertFalse(lst.removeAtIndex(-1));
        assertEquals("1, 2, 3, 4", lst.getListValues());
        assertTrue(lst.removeAtIndex(0));
        assertEquals("2, 3, 4", lst.getListValues());
    }
}
