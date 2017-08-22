package fi.lrkr.pathfinder.gui;

import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.vertex.Step;
import java.awt.BorderLayout;
import java.awt.Color;
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
    private boolean allowEdit;

    /**
     * Constructor for creating the object.
     *
     * @param maze Maze object from which the visualization is created
     */
    public MazePane(Maze maze) {
        this.maze = maze;
        this.allowEdit = true;
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
                if (maze.getMaze()[y][x] == 0) {
                    l.setBackground(Color.WHITE);
                } else {
                    l.setBackground(Color.BLACK);
                }
                l.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        if (allowEdit) {
                            toggleCell(evt);
                            repaint();
                        }
                    }
                });
                boardPane.add(l);
            }
        }
        this.add(boardPane);
    }

    private void toggleCell(java.awt.event.MouseEvent e) {
        //todo: block start/end?
        for (int y = 0; y < labelMap.length; y++) {
            for (int x = 0; x < labelMap[0].length; x++) {
                if (labelMap[y][x] == e.getSource()) {
                    if (maze.getMaze()[y][x] == 0) {
                        maze.getMaze()[y][x] = 1;
                        labelMap[y][x].setBackground(Color.BLACK);
                    } else if (maze.getMaze()[y][x] == 1) {
                        maze.getMaze()[y][x] = 0;
                        labelMap[y][x].setBackground(Color.WHITE);
                    }
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
        repaint();
    }

    public void setAllowEdit(boolean edit) {
        this.allowEdit = edit;
    }
}
