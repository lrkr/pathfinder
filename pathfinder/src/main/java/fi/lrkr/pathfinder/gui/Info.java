package fi.lrkr.pathfinder.gui;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Info extends JPanel {
    private JTextField info;

    public Info() {
        this.info = new JTextField(60);
    }
    
    public void init() {
        info.setEditable(false);
        this.add(info);
    }
    
    public void addText(String s) {
        info.setText(s  + "\n");        
    }
}
