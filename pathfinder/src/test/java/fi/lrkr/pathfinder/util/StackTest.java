package fi.lrkr.pathfinder.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    private Stack<Integer> testStack;

    public StackTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        testStack = new Stack<>();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIsEmpty() {
        assertTrue(testStack.isEmpty());
        testStack.push(1);
        assertFalse(testStack.isEmpty());
    }

    @Test
    public void testPushPop() {
        testStack.push(1);
        int x = testStack.pop();
        assertEquals(1, x);
    }

    @Test
    public void testSize() {
        assertEquals(0, testStack.size());
        testStack.push(1);
        assertEquals(1, testStack.size());
        testStack.pop();
        assertEquals(0, testStack.size());
    }

}
