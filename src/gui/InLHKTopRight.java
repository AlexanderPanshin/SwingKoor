package gui;

import javax.swing.*;
import java.awt.*;

public class InLHKTopRight extends JPanel {

    private JLabel endXlabel;
    private JLabel endYlabel;
    private JTextField endXarea;
    private JTextField endYarea;
    public InLHKTopRight() {
        setLayout(new GridLayout(2,2));
        endXlabel = new JLabel("x");
        endYlabel = new JLabel("y");
        endXarea = new JTextField(4);
        endYarea = new JTextField(4);
        add(endXlabel);
        add(endYlabel);
        add(new JScrollPane(endXarea));
        add(new JScrollPane(endYarea));
    }

    public JTextField getEndXarea() {
        return endXarea;
    }

    public JTextField getEndYarea() {
        return endYarea;
    }
    public boolean isEmpathy(){
        return endXarea.getText().equals("")&&endYarea.getText().equals("");
    }
}
