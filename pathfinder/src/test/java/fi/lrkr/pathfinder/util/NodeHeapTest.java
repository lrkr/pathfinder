package fi.lrkr.pathfinder.util;

import fi.lrkr.pathfinder.vertex.Location;
import fi.lrkr.pathfinder.vertex.Node;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NodeHeapTest {

    private NodeHeap testHeap;

    public NodeHeapTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.testHeap = new NodeHeap();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAddRemove() {
        Node testNode = new Node(new Location(1, 1), 20);
        testNode.setLength(5);
        testHeap.add(testNode);
        Node testNode2 = new Node(new Location(1, 1), 10);
        testNode2.setLength(1);
        testHeap.add(testNode2);

        Node testNode3 = new Node(new Location(1, 1), 20);
        testNode3.setLength(5);
        Node testNode4 = new Node(new Location(1, 1), 10);
        testNode4.setLength(1);

        Node testNode5 = testHeap.poll();
        assertEquals(testNode4.getHeuristic(), testNode5.getHeuristic(), 0.0);
        assertEquals(testNode4, testNode5);
    }

    @Test
    public void testIsEmpty() {
        assertTrue(testHeap.isEmpty());
        Node testNode = new Node(new Location(1, 1), 20);
        testNode.setLength(5);
        testHeap.add(testNode);
        assertFalse(testHeap.isEmpty());
        testHeap.poll();
        assertTrue(testHeap.isEmpty());
    }

    @Test
    public void testContains() {
        Node testNode = new Node(new Location(1, 1), 20);
        testNode.setLength(5);
        assertEquals(-1, testHeap.contains(testNode));
        testHeap.add(testNode);
        assertEquals(1, testHeap.contains(testNode));
    }

}
