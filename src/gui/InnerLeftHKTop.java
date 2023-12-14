package gui;

import javax.swing.*;
import java.awt.*;

public class InnerLeftHKTop extends JPanel {
    private JLabel labelKoordinate;
    private InLHKTopLeft leftPanel;
    private InLHKTopRight rightPanel;
    public InnerLeftHKTop() {
        setLayout(new BorderLayout());
        labelKoordinate = new JLabel("Координаты отрезка: ");
        leftPanel = new InLHKTopLeft();
        rightPanel = new InLHKTopRight();
        add(labelKoordinate, BorderLayout.NORTH);
        add(leftPanel,BorderLayout.WEST);
        add(rightPanel,BorderLayout.EAST);
    }
}
