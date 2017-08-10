package fi.lrkr.pathfinder;

import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.node.Step;
import fi.lrkr.pathfinder.gui.GUI;
import fi.lrkr.pathfinder.pathfinder.AStar;
import fi.lrkr.pathfinder.pathfinder.BreadthFirst;
import fi.lrkr.pathfinder.pathfinder.Pathfinder;
import fi.lrkr.pathfinder.util.Queue;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Maze maze = new Maze();
        Pathfinder pf = new BreadthFirst(maze);
        //Pathfinder pf = new AStar(maze);
        Queue<Step> steps = pf.solve();
        GUI g = new GUI(maze);
        SwingUtilities.invokeLater(g);
        //muuten null pointtaa joskus??
        Thread.sleep(3000);
        g.playback(steps);
    }
}
