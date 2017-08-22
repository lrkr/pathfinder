package fi.lrkr.pathfinder.gui;

import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.pathfinder.AStar;
import fi.lrkr.pathfinder.pathfinder.BreadthFirst;
import fi.lrkr.pathfinder.pathfinder.Pathfinder;
import fi.lrkr.pathfinder.pathfinder.heuristic.Manhattan;
import fi.lrkr.pathfinder.pathfinder.heuristic.ManhattanNudged;
import fi.lrkr.pathfinder.util.List;
import java.awt.GridLayout;
import java.util.Hashtable;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 * Class provides a simple settings for the visualization.
 */
public class Settings extends JPanel {

    private List<Maze> mazes;
    private JComboBox mazeSelection;
    private JComboBox algoSelection;
    private JSlider speed;
    private JButton start;

    /**
     * Constructor for creating Settings object.
     *
     * @param mazes List of Mazes for selection
     */
    public Settings(List<Maze> mazes) {
        this.mazeSelection = new JComboBox<>();
        this.algoSelection = new JComboBox<>();
        this.speed = new JSlider(JSlider.HORIZONTAL, 1, 11, 6);
        this.start = new JButton("Start");
        this.mazes = mazes;
    }

    /**
     * Creates setting components
     */
    public void init() {
        this.setLayout(new GridLayout(0, 4));
        for (int i = 0; i < mazes.length(); i++) {
            mazeSelection.addItem(mazes.get(i));
        }
        this.add(mazeSelection);

        algoSelection.addItem("BFS");
        algoSelection.addItem("A* (Manhattan)");
        algoSelection.addItem("A* (Nudged Manhattan)");
        this.add(algoSelection);

        Hashtable labelTable = new Hashtable();
        labelTable.put(1, new JLabel("Slow"));
        labelTable.put(10, new JLabel("Fast"));
        speed.setLabelTable(labelTable);

        speed.setPaintLabels(true);
        speed.setPaintLabels(true);
        this.add(speed);
        this.add(start);
    }

    /**
     *
     * @return Currently selected Maze in the ComboBox
     */
    public Maze getSelectedMaze() {
        return (Maze) mazeSelection.getSelectedItem();
    }

    /**
     *
     * @return Pathfinder to be run
     */
    public Pathfinder getSelectedAlgo() {
        String algo = (String) algoSelection.getSelectedItem();
        Maze maze = (Maze) mazeSelection.getSelectedItem();
        switch (algo) {
            case "BFS":
                return new BreadthFirst(maze);
            case "A* (Manhattan)":
                return new AStar(maze, new Manhattan());
            case "A* (Nudged Manhattan)":
                return new AStar(maze, new ManhattanNudged());
            default:
                return null;
        }
    }

    /**
     *
     * @return Start button
     */
    public JButton getStartButton() {
        return this.start;
    }

    /**
     *
     * @return Selected speed value
     */
    public int getSpeed() {
        return speed.getValue();
    }
}
