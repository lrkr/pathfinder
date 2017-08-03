package fi.lrkr.pathfinder;

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
     * Paints a square with a color
     *
     * @param s Step object which associates a color to a Location.
     */
    public void paintCell(Step s) {
        mazePane.paintCell(s);
    }
}
