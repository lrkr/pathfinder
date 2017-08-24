package fi.lrkr.pathfinder.gui;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Class provides functionality for simple statistics text field.
 */
public class Info extends JPanel {

    private JTextField info;

    /**
     * Constructor for creating Info object.
     */
    public Info() {
        this.info = new JTextField(60);
    }

    /**
     * Initiates the statistics field.
     */
    public void init() {
        info.setEditable(false);
        this.add(info);
    }

    /**
     *
     * @param s Text to be shown
     */
    public void setText(String s) {
        info.setText(s + "\n");
    }
}
