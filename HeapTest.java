import com.graham.Lists.Heap;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeapTest {

    @Test
    public void testPop() {
        // Test pop.

        Heap heap = new Heap();

        assertFalse(heap.pop());  // Empty heap.

        for(int i = 0; i < 5; i++) {
            heap.append(i);
        }

        for(int i = 0; i < heap.getLength() - 1; i++) {
            int value = heap.getTopValue();
            assertTrue(heap.pop());
            assertEquals(heap.getTopValue(), value - 1);
        }
    }

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
