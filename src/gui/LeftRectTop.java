package gui;

import javax.swing.*;
import java.awt.*;

public class LeftRectTop extends JPanel {
    private JLabel upLeftKoor;
    private InLeftRectTopGrid xyStart;
    public LeftRectTop() {
        setLayout(new BorderLayout());
        upLeftKoor = new JLabel("Верхний левывй угол прямоугольной области:");
        xyStart = new InLeftRectTopGrid();
        add(upLeftKoor, BorderLayout.NORTH);
        add(xyStart,BorderLayout.SOUTH);
    }

    public InLeftRectTopGrid getXyStart() {
        return xyStart;
    }
}
