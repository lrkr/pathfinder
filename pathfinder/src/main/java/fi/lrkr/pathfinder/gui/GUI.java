package fi.lrkr.pathfinder.gui;

import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.vertex.Step;
import fi.lrkr.pathfinder.util.Queue;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * Class provides a simple UI where the pathfinding visualization is shown.
 */
public class GUI implements Runnable {

    private final Maze maze;
    private JFrame frame;
    private MazePane mazePane;

    /**
     * Constructor for creating GUI object for visualizing the Maze object.
     *
     * @param maze Maze to be visualized
     */
    public GUI(Maze maze) {
        this.maze = maze;
    }

    @Override
    public void run() {
        frame = new JFrame("Pathfinder");
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Creates the components needed for visualization.
     *
     * @param contentPane
     */
    private void createComponents(Container contentPane) {
        mazePane = new MazePane(maze);
        mazePane.init();
        contentPane.add(mazePane);
    }

    /**
     * Visualizes the Pathfinder's checked nodes and final route.
     * 
     * @param steps Queue of Step objects
     */
    public void playback(Queue<Step> steps) {
        Long time = System.currentTimeMillis();
        while (!steps.isEmpty()) {
            if (System.currentTimeMillis() > time + 20) {
                Step current = steps.removeFirst();
                mazePane.paintCell(current);
                time = System.currentTimeMillis();
            }
        }
    }
}
