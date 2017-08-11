package fi.lrkr.pathfinder.vertex;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {

    public NodeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testEquals() {
        Node n1 = new Node(new Location(1, 2), 4);
        Node n2 = new Node(new Location(1, 2), 5);
        assertTrue(n1.equals(n2));
    }

    @Test
    public void testEquals2() {
        Node n1 = new Node(new Location(1, 2), 4);
        Node n2 = new Node(new Location(1, 3), 5);
        assertFalse(n1.equals(n2));
    }

    @Test
    public void testEquals3() {
        Node n1 = new Node(new Location(1, 2), 4);
        Node n2 = new Node(new Location(1, 2), 5);
        n2.setPrevious(n1);
        assertTrue(n1.equals(n2));
    }
    
    @Test
    public void testEquals4() {
        Node n1 = new Node(new Location(1,2), 4);
        String s = "moi";
        assertFalse(n1.equals(s));
    }
    
    @Test
    public void testHashCode() {
        Node n1 = new Node(new Location(1, 2), 4);
        Node n2 = new Node(new Location(1, 2), 5);
        n2.setPrevious(n1);
        assertEquals(n1.hashCode(), n2.hashCode());
    }
}
