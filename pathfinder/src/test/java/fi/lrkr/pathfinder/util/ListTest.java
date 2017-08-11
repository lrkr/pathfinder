package fi.lrkr.pathfinder.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListTest {

    private List<Integer> testList;

    public ListTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        testList = new List<>();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAddAndLength() {
        assertEquals(0, testList.length());
        testList.add(1);
        assertEquals(1, testList.length());
    }

    @Test
    public void testDoubleSize() {
        for (int i = 0; i < 999; i++) {
            testList.add(i);
        }
        assertEquals(999, testList.length());
    }

    @Test
    public void testGet() {
        for (int i = 0; i < 10; i++) {
            testList.add(i);
        }
        for (int i = 9; i >= 0; i--) {
            assertEquals((Integer) i, testList.get(i));
        }
    }
    
    @Test(expected = IndexOutOfBoundsException.class) 
    public void testGetOutOfBoundsPositive() {
        testList.get(9999);
    }
    
    @Test(expected = IndexOutOfBoundsException.class) 
    public void testGetOutOfBoundsNegative() {
        testList.get(-1);
    }
    
    @Test(expected = IndexOutOfBoundsException.class) 
    public void testGetOutOfBoundsEmpty() {
        testList.get(0);
    }
    
    @Test
    public void testContains() {
        for (int i = 0; i < 10; i++) {
            testList.add(i);
        }
        assertTrue(testList.contains(5));
        assertFalse(testList.contains(-1));
    }

}
