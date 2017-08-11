package fi.lrkr.pathfinder.vertex;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LocationTest {

    public LocationTest() {
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
        Location l1 = new Location(4, 2);
        Location l2 = new Location(4, 2);
        assertTrue(l1.equals(l2));
    }

    @Test
    public void testEquals2() {
        Location l1 = new Location(4, 2);
        Location l2 = new Location(4, 4);
        assertFalse(l1.equals(l2));
    }

    @Test
    public void testEquals3() {
        Location l1 = new Location(4, 2);
        Location l2 = new Location(4, 2);
        l1.setPrevious(l2);
        assertTrue(l1.equals(l2));
    }
    
    @Test
    public void testEquals4() {
        Location l1 = new Location(4, 2);
        String s = "moi";
        assertFalse(l1.equals(s));
    }
    
    @Test
    public void testHashCode() {
        Location l1 = new Location(4, 2);
        Location l2 = new Location(4, 2);
        assertEquals(l1.hashCode(), l2.hashCode());
    }

}
