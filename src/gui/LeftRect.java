package gui;

import javax.swing.*;
import java.awt.*;

public class LeftRect extends JPanel {
    private LeftRectTop leftRectTop;
    private LeftRectBot leftRectBot;
    public LeftRect() {
        setLayout(new BorderLayout());
        leftRectTop = new LeftRectTop();
        leftRectBot = new LeftRectBot();
        add(leftRectTop,BorderLayout.NORTH);
        add(leftRectBot,BorderLayout.SOUTH);
    }
}
