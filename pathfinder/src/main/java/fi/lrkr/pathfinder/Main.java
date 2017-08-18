package fi.lrkr.pathfinder;

import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.gui.GUI;
import fi.lrkr.pathfinder.util.List;
import fi.lrkr.pathfinder.file.MazeReader;
import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        MazeReader mr = new MazeReader();
        List<Maze> mazeList = mr.readMazes();
        GUI g = new GUI(mazeList);
        SwingUtilities.invokeAndWait(g);
    }
}
