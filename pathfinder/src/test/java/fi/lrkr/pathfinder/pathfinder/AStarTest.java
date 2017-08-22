package fi.lrkr.pathfinder.pathfinder;

import fi.lrkr.pathfinder.gui.Result;
import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.pathfinder.heuristic.Manhattan;
import fi.lrkr.pathfinder.vertex.Location;
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
        this.testMaze = new Maze(new Location(1, 0), new Location(7, 3), mazeArray, "testMaze");
        this.testAStar = new AStar(testMaze, new Manhattan());
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSolve() {
        Result result = testAStar.solve();
        assertNotNull(result);
        //16 blue + 15 cyan + 14 red steps
        assertEquals(45, result.getLenght());
        assertEquals(testMaze.getStart(), result.getNext().getLocation());
        assertEquals(testMaze.getEnd(), result.getRoute().removeLast().getLocation());
    }

    @Test
    public void testSolve2() {
        testMaze.getMaze()[1][1] = 1;
        Result result = testAStar.solve();
        assertEquals(1, result.getLenght());
    }
}
