package fi.lrkr.pathfinder;

import fi.lrkr.pathfinder.gui.GUI;
import fi.lrkr.pathfinder.util.Queue;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Maze maze = new Maze();
        BreadthFirst bfs = new BreadthFirst(maze);
        Queue<Step> steps = bfs.solve();
        GUI g = new GUI(maze);
        SwingUtilities.invokeLater(g);
        //muuten null pointtaa joskus??
        Thread.sleep(3000);
        g.playback(steps);
    }
}
