import org.junit.Test;

import com.graham.Lists.LinkedList;

import static org.junit.Assert.*;


public class LinkedListTest {

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
}
