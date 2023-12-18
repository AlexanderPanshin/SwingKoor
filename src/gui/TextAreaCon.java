package gui;

import javax.swing.*;
import java.awt.*;

public class TextAreaCon extends JPanel {
    private JTextArea jTextArea;

    public TextAreaCon() {
        //setLayout(new BorderLayout());
        jTextArea = new JTextArea(5,20);
        add(jTextArea);
    }
}
