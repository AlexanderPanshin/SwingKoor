package gui;

import javax.swing.*;
import java.awt.*;

public class LeftRectBot extends JPanel {
    private JLabel downRigtKoor;
    private InLeftRectBotGrid xyEnd;
    public LeftRectBot() {
        downRigtKoor = new JLabel("Нижний правый угол прямоуголной области:");
        xyEnd = new InLeftRectBotGrid();
        setLayout(new BorderLayout());
        add(downRigtKoor,BorderLayout.NORTH);
        add(xyEnd,BorderLayout.SOUTH);
    }
}
