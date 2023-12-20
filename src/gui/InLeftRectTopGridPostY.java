package gui;

import javax.swing.*;
import java.awt.*;

public class InLeftRectTopGridPostY extends JPanel{
    private JLabel xLabel;
    private JTextField xTopTextFiled;
    public InLeftRectTopGridPostY() {
        setLayout(new BorderLayout());
        xLabel = new JLabel("Y");
        xTopTextFiled = new JTextField(4);
        add(xLabel,BorderLayout.NORTH);
        add(xTopTextFiled,BorderLayout.SOUTH);
    }

    public JTextField getxTopTextFiled() {
        return xTopTextFiled;
    }
}
