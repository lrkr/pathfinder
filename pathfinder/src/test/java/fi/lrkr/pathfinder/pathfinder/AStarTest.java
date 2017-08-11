package fi.lrkr.pathfinder.pathfinder;

import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.util.Queue;
import fi.lrkr.pathfinder.vertex.Location;
import fi.lrkr.pathfinder.vertex.Step;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AStarTest {

    private Maze testMaze;
    private AStar testAStar;

    public AStarTest() {
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
        this.testAStar = new AStar(testMaze);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSolve() {
        Queue<Step> steps = testAStar.solve();
        assertNotNull(steps);
        //16 looked cell steps + 14 path steps
        assertEquals(30, steps.lenght());
        assertEquals(testMaze.getStart(), steps.removeFirst().getLocation());
        assertEquals(testMaze.getEnd(), steps.removeLast().getLocation());
    }

    @Test
    public void testSolve2() {
        testMaze.getMaze()[1][1] = 1;
        Queue<Step> steps = testAStar.solve();
        assertEquals(1, steps.lenght());
    }
}
