package gui;

import javax.swing.*;
import java.awt.*;

public class InLeftRectTopGrid extends JPanel {
    private InLeftRectTopGridPostX inLeftRectTopGridPostX;
    private InLeftRectTopGridPostY inLeftRectTopGridPostY;
    public InLeftRectTopGrid() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        inLeftRectTopGridPostX = new InLeftRectTopGridPostX();
        inLeftRectTopGridPostY = new InLeftRectTopGridPostY();
        add(inLeftRectTopGridPostX);
        add(inLeftRectTopGridPostY);
    }
}
