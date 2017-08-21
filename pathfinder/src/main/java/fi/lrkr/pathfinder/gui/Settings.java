package fi.lrkr.pathfinder.gui;

import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.pathfinder.AStar;
import fi.lrkr.pathfinder.pathfinder.BreadthFirst;
import fi.lrkr.pathfinder.pathfinder.Pathfinder;
import fi.lrkr.pathfinder.util.List;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 * Class provides a simple ComboBox for selecting Mazes (and probably other
 * settings in the future).
 */
public class Settings extends JPanel {

    private List<Maze> mazes;
    private JComboBox mazeSelection;
    private JComboBox algoSelection;
    private JButton start;

    /**
     * Constructor for creating Settings object.
     *
     * @param mazes List of Mazes for selection
     */
    public Settings(List<Maze> mazes) {
        this.mazeSelection = new JComboBox<>();
        this.algoSelection = new JComboBox<>();
        this.start = new JButton("Start");
        this.mazes = mazes;
    }

    /**
     * Populates the ComboBox with selectable Mazes.
     */
    public void init() {
        this.setLayout(new GridLayout(0, 3));
        for (int i = 0; i < mazes.length(); i++) {
            mazeSelection.addItem(mazes.get(i));
        }
        this.add(mazeSelection);

        algoSelection.addItem("BFS");
        algoSelection.addItem("A*");
        this.add(algoSelection);
        this.add(start);
    }

    /**
     *
     * @return Currently selected Maze in the ComboBox
     */
    public Maze getSelectedMaze() {
        return (Maze) mazeSelection.getSelectedItem();
    }

    public Pathfinder getSelectedAlgo() {
        String algo = (String) algoSelection.getSelectedItem();
        Maze maze = (Maze) mazeSelection.getSelectedItem();
        switch (algo) {
            case "BFS":
                return new BreadthFirst(maze);
            case "A*":
                return new AStar(maze);
            default:
                return null;
        }
    }

    public JButton getStartButton() {
        return this.start;
    }

}
