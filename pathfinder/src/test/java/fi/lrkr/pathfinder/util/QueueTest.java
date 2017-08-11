package fi.lrkr.pathfinder.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {

    private Queue<Integer> testQ;

    public QueueTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        testQ = new Queue<>();
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void testIsEmpty() {
        assertTrue(testQ.isEmpty());
        testQ.add(1);
        assertFalse(testQ.isEmpty());
    }
    
    @Test
    public void testSize() {
        assertEquals(0, testQ.lenght());
        testQ.add(1);
        assertEquals(1, testQ.lenght());
        testQ.removeFirst();
        assertEquals(0, testQ.lenght());
        testQ.add(1);
        testQ.removeLast();
        assertEquals(0, testQ.lenght());
    }
    
    @Test
    public void testOrder() {
        for (int i = 0; i < 10; i++) {
            testQ.add(i);
        }
        for (int i = 9; i >= 0; i--) {
            assertEquals((Integer) i, testQ.removeLast());
        }
    }
}
