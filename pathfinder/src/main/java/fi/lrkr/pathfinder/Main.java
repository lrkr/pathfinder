package fi.lrkr.pathfinder;

import java.util.Deque;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Maze maze = new Maze();
        BreadthFirst bfs = new BreadthFirst(maze);
        Deque<Step> steps = bfs.solve();
        GUI g = new GUI(maze);
        SwingUtilities.invokeLater(g);
        //muuten null pointtaa joskus??
        Thread.sleep(1111);
        Long time = System.currentTimeMillis();
        while (!steps.isEmpty()) {
            if (System.currentTimeMillis() > time + 20) {
                Step current = steps.removeFirst();
                g.paintCell(current);
                time = System.currentTimeMillis();
            }
        }
    }
}
