package fi.lrkr.pathfinder.gui;

import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.util.List;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 * Class provides a simple ComboBox for selecting Mazes (and probably other
 * settings in the future).
 */
public class Settings extends JPanel {

    private List<Maze> mazes;
    private JComboBox mazeSelection;

    /**
     * Constructor for creating Settings object.
     *
     * @param mazes List of Mazes for selection
     */
    public Settings(List<Maze> mazes) {
        this.mazeSelection = new JComboBox<>();
        this.mazes = mazes;
    }

    /**
     * Populates the ComboBox with selectable Mazes.
     */
    public void init() {
        for (int i = 0; i < mazes.length(); i++) {
            mazeSelection.addItem(mazes.get(i));
        }
        this.add(mazeSelection);
    }

    /**
     *
     * @return Currently selected Maze in the ComboBox
     */
    public Maze getSelected() {
        return (Maze) mazeSelection.getSelectedItem();
    }

}
