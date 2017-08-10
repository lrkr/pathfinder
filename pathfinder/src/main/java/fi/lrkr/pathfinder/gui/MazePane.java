package fi.lrkr.pathfinder.gui;

import fi.lrkr.pathfinder.Maze;
import fi.lrkr.pathfinder.Step;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 * Class is used for visualizing the Maze's squares.
 */
public class MazePane extends JPanel {

    private Maze maze;
    private JLayeredPane boardPane;
    private JLabel[][] labelMap;

    /**
     * Constructor for creating the object.
     *
     * @param maze Maze object from which the visualization is created
     */
    public MazePane(Maze maze) {
        this.maze = maze;
    }

    /**
     * Initializes the needed JLabels for the Maze visualization.
     */
    public void init() {
        int width = maze.getWidth();
        int height = maze.getHeight();
        this.setLayout(new BorderLayout());
        boardPane = new JLayeredPane();
        boardPane.setLayout(new GridLayout(height, width));
        this.labelMap = new JLabel[height][width];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                JLabel l = new JLabel();
                l.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                l.setOpaque(true);
                labelMap[y][x] = l;
                boardPane.add(l);
            }
        }
        this.add(boardPane);
    }

    @Override
    public void paintComponent(Graphics g) {
        int[][] m = maze.getMaze();
        super.paintComponent(g);
        for (int y = 0; y < maze.getHeight(); y++) {
            for (int x = 0; x < maze.getWidth(); x++) {
                if (m[y][x] == 0) {
                    labelMap[y][x].setBackground(Color.WHITE);
                } else if (m[y][x] == 1) {
                    labelMap[y][x].setBackground(Color.BLACK);
                }
            }
        }
    }

    /**
     * Paints a square with a color
     *
     * @param s Step object which associates a color to a Location.
     */
    public void paintCell(Step s) {
        labelMap[s.getLocation().getY()][s.getLocation().getX()].setBackground(s.getColor());
    }
}
