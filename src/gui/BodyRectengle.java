package gui;

import javax.swing.*;
import java.awt.*;

public class BodyRectengle extends JPanel {
    private RightRect rightRect;
    private LeftRect leftRect;
    public BodyRectengle() {
        //setLayout(new BorderLayout());
        setLayout(new FlowLayout(FlowLayout.LEFT));
        rightRect = new RightRect();
        leftRect = new LeftRect();
        add(leftRect,BorderLayout.WEST);
        add(rightRect,BorderLayout.EAST);
    }
}
