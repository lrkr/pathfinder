package fi.lrkr.pathfinder.file;

import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MazeReaderTest {

    private MazeReader mr;

    public MazeReaderTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        mr = new MazeReader();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testReadMazes() {
        List<Maze> mazeList = mr.readMazes();
        for (int i = 0; i < mazeList.length(); i++) {
            Maze maze = mazeList.get(i);
            assertNotNull(maze.getEnd());
            assertNotNull(maze.getStart());
            assertTrue(maze.getHeight() == maze.getMaze().length);
            assertTrue(maze.getWidth() == maze.getMaze()[0].length);            
        }
    }

}
