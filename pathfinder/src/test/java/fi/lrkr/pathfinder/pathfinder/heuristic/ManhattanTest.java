package fi.lrkr.pathfinder.pathfinder.heuristic;

import fi.lrkr.pathfinder.vertex.Location;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ManhattanTest {

    private Manhattan m;
    private ManhattanNudged mn;
    private ManhattanCross mc;
    private Location l1;
    private Location l2;
    private Location l3;
    private Location l4;

    public ManhattanTest() {

    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.m = new Manhattan();
        this.mn = new ManhattanNudged();
        this.mc = new ManhattanCross();
        this.l1 = new Location(0, 0);
        this.l2 = new Location(1, 1);
        this.l3 = new Location(2, 2);
        this.l4 = new Location(0,2);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCalculateHScoreManhattan() {
        assertTrue(new Double(2).equals(m.calculateHScore(l1, l2, null)));
    }

    @Test
    public void testCalculateHScoreManhattanNudged() {
        assertTrue(2 < mn.calculateHScore(l1, l2, null));
    }

    @Test
    public void testCalculateHScoreManhattanCross() {
        //on path should be the same as Manhattan
        assertTrue(new Double(2).equals(mc.calculateHScore(l1, l2, l3)));
        //off path should be higher than Manhattan
        assertTrue(2 < mc.calculateHScore(l1, l4, l3));
    }

}
