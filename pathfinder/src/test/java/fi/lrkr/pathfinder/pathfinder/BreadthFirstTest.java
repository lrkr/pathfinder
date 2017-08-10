package fi.lrkr.pathfinder.pathfinder;

import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.pathfinder.BreadthFirst;
import fi.lrkr.pathfinder.node.Location;
import fi.lrkr.pathfinder.node.Step;
import fi.lrkr.pathfinder.util.List;
import fi.lrkr.pathfinder.util.Queue;
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
        Queue<Step> steps = testBFS.solve();
        assertNotNull(steps);
        //16 looked cell steps + 14 path steps
        assertEquals(30, steps.lenght());
        assertEquals(testMaze.getStart(), steps.removeFirst().getLocation());
        assertEquals(testMaze.getEnd(), steps.removeLast().getLocation());
    }
    
    @Test
    public void testSolve2() {
        testMaze.getMaze()[1][1] = 1;
        Queue<Step> steps = testBFS.solve();
        assertEquals(1, steps.lenght());
    }

    @Test
    public void testGetAdjacent() {
        Location testLocation = new Location(3, 1);
        List<Location> adj = testBFS.getAdjacent(testLocation);
        assertEquals(2, adj.length());
        assertEquals(new Location(3, 2), adj.get(0));
        assertEquals(new Location(4, 1), adj.get(1));
    }

    public void testGetAdjacent2() {
        Location testLocation = new Location(52, 1234);
        List<Location> adj = testBFS.getAdjacent(testLocation);
        assertEquals(0, adj.length());
    }
}
