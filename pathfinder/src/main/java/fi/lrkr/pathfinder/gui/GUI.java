package fi.lrkr.pathfinder.gui;

import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.pathfinder.BreadthFirst;
import fi.lrkr.pathfinder.pathfinder.AStar;
import fi.lrkr.pathfinder.pathfinder.Pathfinder;
import fi.lrkr.pathfinder.util.List;
import fi.lrkr.pathfinder.vertex.Step;
import fi.lrkr.pathfinder.util.Queue;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * Class provides a simple UI where the pathfinding visualization is shown.
 */
public class GUI implements Runnable {

    private List<Maze> mazes;
    private JFrame frame;
    private MazePane mazePane;
    private Settings settings;
    private Timer timer;
    private int counter;

    /**
     * Constructor for creating GUI object for visualizing the Maze object.
     *
     * @param mazes List of Mazes
     */
    public GUI(List<Maze> mazes) {
        this.mazes = mazes;
    }

    @Override
    public void run() {
        frame = new JFrame("Pathfinder");
        //frame.setPreferredSize(new Dimension(800, 500));
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
        contentPane.setLayout(new BorderLayout());
        settings = new Settings(mazes);
        settings.init();
        settings.setPreferredSize(new Dimension(600, 40));
        contentPane.add(settings, BorderLayout.CENTER);
        doMazePane(mazes.get(0), contentPane);

        settings.getStartButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.getStartButton().setEnabled(false);
                Maze newMaze = settings.getSelectedMaze();
                doMazePane(newMaze, contentPane);
                Pathfinder pf = settings.getSelectedAlgo();
                playback(pf.solve());
            }
        });
    }

    private void doMazePane(Maze maze, Container contentPane) {
        if (mazePane != null) {
            contentPane.remove(mazePane);
        }
        mazePane = new MazePane(maze);
        mazePane.init();
        mazePane.setPreferredSize(new Dimension(600, 400));
        contentPane.add(mazePane, BorderLayout.NORTH);
    }

    /**
     * Visualizes the Pathfinder's checked nodes and final route.
     *
     * @param steps Queue of Step objects
     */
    private void playback(Queue<Step> steps) {
        frame.paintComponents(frame.getGraphics());
        counter = steps.lenght();
        int delay = 10;

        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (counter == 0) {
                    timer.stop();
                    settings.getStartButton().setEnabled(true);
                } else {
                    Step current = steps.removeFirst();
                    mazePane.paintCell(current);
                    counter--;
                }
            }
        };
        timer = new Timer(delay, action);
        timer.setInitialDelay(0);
        timer.start();
    }
}
