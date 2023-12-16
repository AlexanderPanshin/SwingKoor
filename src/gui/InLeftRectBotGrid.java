package gui;

import javax.swing.*;
import java.awt.*;

public class InLeftRectBotGrid extends JPanel {
    private InLeftRectBotGridPostX inLeftRectBotGridPostX;
    private InLeftRectBotGridPostY inLeftRectBotGridPostY;
    public InLeftRectBotGrid() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        inLeftRectBotGridPostX = new InLeftRectBotGridPostX();
        inLeftRectBotGridPostY = new InLeftRectBotGridPostY();
        add(inLeftRectBotGridPostX);
        add(inLeftRectBotGridPostY);

    }
}
