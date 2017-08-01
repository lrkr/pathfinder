package fi.lrkr.pathfinder;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;

public class GUI implements Runnable {

    private final Maze maze;
    private JFrame frame;
    private MazePane mazePane;

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

    private void createComponents(Container contentPane) {
        mazePane = new MazePane(maze);
        mazePane.init();
        contentPane.add(mazePane);
    }

    public void paintCell(Step s) {
        mazePane.paintCell(s);
    }
}
