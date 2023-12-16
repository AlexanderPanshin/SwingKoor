package gui;

import javax.swing.*;
import java.awt.*;

public class InLeftRectTopGridPostX extends JPanel{
    private JLabel xLabel;
    private JTextField xTopTextFiled;
    public InLeftRectTopGridPostX() {
        setLayout(new BorderLayout());
        xLabel = new JLabel("x");
        xTopTextFiled = new JTextField(4);
        add(xLabel,BorderLayout.NORTH);
        add(xTopTextFiled,BorderLayout.SOUTH);
    }
}
