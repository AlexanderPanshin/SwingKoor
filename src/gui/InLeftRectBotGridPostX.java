package gui;

import javax.swing.*;
import java.awt.*;

public class InLeftRectBotGridPostX extends JPanel {
    private JLabel xLabel;
    private JTextField xBotTextFiled;
    public InLeftRectBotGridPostX() {
        setLayout(new BorderLayout());
        xLabel = new JLabel("x");
        xBotTextFiled = new JTextField(4);
        add(xLabel,BorderLayout.NORTH);
        add(xBotTextFiled,BorderLayout.SOUTH);
    }
}
