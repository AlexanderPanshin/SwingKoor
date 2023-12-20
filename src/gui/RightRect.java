package gui;

import javax.swing.*;

public class RightRect extends JPanel {
    private JTextArea jTextArea;
    public RightRect() {
        jTextArea = new JTextArea(5,13);
        add(jTextArea);
    }

    public JTextArea getjTextArea() {
        return jTextArea;
    }
}
