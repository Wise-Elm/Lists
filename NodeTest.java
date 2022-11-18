import org.junit.Test;

import com.graham.LinkedList.Node;

import static org.junit.Assert.*;


public class NodeTest {

    @Test
    public void testSetNodeValue() {
        // Test Node.setNodeValue.

        Node node = new Node(1);

        assertEquals(1, node.getNodeValue());
        node.setNodeValue(2);
        assertEquals(2, node.getNodeValue());
    }

    @Test
    public void testGetNodeValue() {
        // Test Node.getNodeValue.

        // Set initial value of 1.
        Node node = new Node(1);

        // Test node value.
        assertEquals(1, node.getNodeValue());

        // Test change node value.
        node.setNodeValue(2);
        assertEquals(2, node.getNodeValue());
    }

    @Test
    public void testSetNodeNext() {
        // Test Node.getNodeNext.

        Node node1 = new Node(1);
        Node node2 = new Node(2);

        // Set node1 next.
        node1.setNodeNext(node2);

        // Test node1 next.
        assertEquals(node2, node1.getNodeNext());

        // Test remove node next.
        node1.removeNodeNext();
        assertNull(node1.getNodeNext());

    }

    @Test
    public void testGetNodeNext() {
        // Test getNodeNext.

        Node node1 = new Node(1);
        Node node2 = new Node(2);

        // Set node1 next.
        node1.setNodeNext(node2);

        // Test node1 next.
        assertEquals(node2, node1.getNodeNext());
    }

    @Test
    public void testRemoveNodeNext() {
        // Test removeNodeNext() {

        Node node1 = new Node(1);
        Node node2 = new Node(2);

        // Set node1 next.
        node1.setNodeNext(node2);

        // Remove node next.
        node1.removeNodeNext();

        // Test node1 next.
        assertNull(node1.getNodeNext());
    }
}
