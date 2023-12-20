package gui;

import javax.swing.*;
import java.awt.*;

public class InLeftRectBotGridPostY extends JPanel{
    private JLabel xLabel;
    private JTextField xBotTextFiled;
    public InLeftRectBotGridPostY() {
        setLayout(new BorderLayout());
        xLabel = new JLabel("Y");
        xBotTextFiled = new JTextField(4);
        add(xLabel,BorderLayout.NORTH);
        add(xBotTextFiled,BorderLayout.SOUTH);
    }

    public JTextField getxBotTextFiled() {
        return xBotTextFiled;
    }
}
