package gui;

import javax.swing.*;
import java.awt.*;

public class InLHKTopLeft extends JPanel {
    private JLabel startXlabel;
    private JLabel startYLabel;
    private JTextField startXarea;
    private JTextField startYarea;

    public InLHKTopLeft() {
        setLayout(new GridLayout(2,2));
        startXlabel = new JLabel("x");
        startYLabel = new JLabel("y");
        startXarea = new JTextField(4);
        startYarea = new JTextField(4);
        add(startXlabel);
        add(startYLabel);
        add(new JScrollPane(startXarea));
        add(new JScrollPane(startYarea));
    }
}
