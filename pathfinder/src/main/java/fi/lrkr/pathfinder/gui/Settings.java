package fi.lrkr.pathfinder.gui;

import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.util.List;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class Settings extends JPanel {

    private List<Maze> mazes;
    private JComboBox mazeSelection;

    public Settings(List<Maze> mazes) {
        this.mazeSelection = new JComboBox<>();
        this.mazes = mazes;
    }

    public void init() {
        for (int i = 0; i < mazes.length(); i++) {
            mazeSelection.addItem(mazes.get(i));
        }
        this.add(mazeSelection);
    }

    public Maze getSelected() {
        return (Maze) mazeSelection.getSelectedItem();
    }

}
