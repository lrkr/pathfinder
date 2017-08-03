package fi.lrkr.pathfinder;

import java.util.Deque;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BreadthFirstTest {

    private Maze testMaze;
    private BreadthFirst testBFS;

    public BreadthFirstTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        int[][] mazeArray = new int[][]{
            {1, 0, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 0, 0, 0, 0, 1},
            {1, 0, 1, 0, 1, 0, 0, 1},
            {1, 0, 0, 0, 0, 1, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1}};
        this.testMaze = new Maze(new Location(1, 0), new Location(7, 3), mazeArray);
        this.testBFS = new BreadthFirst(testMaze);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSolve() {
        Deque<Step> steps = testBFS.solve();
        assertNotNull(steps);
        //16 looked cell steps + 14 path steps
        assertEquals(30, steps.size());
        assertEquals(testMaze.getStart(), steps.getFirst().getLocation());
        assertEquals(testMaze.getEnd(), steps.getLast().getLocation());
    }

    @Test
    public void testGetAdjacent() {
        Location testLocation = new Location(3, 1);
        List<Location> adj = testBFS.getAdjacent(testLocation);
        assertEquals(2, adj.size());
        assertEquals(new Location(3, 2), adj.get(0));
        assertEquals(new Location(4, 1), adj.get(1));
    }

    public void testGetAdjacent2() {
        Location testLocation = new Location(52, 1234);
        List<Location> adj = testBFS.getAdjacent(testLocation);
        assertEquals(0, adj.size());
    }
}
