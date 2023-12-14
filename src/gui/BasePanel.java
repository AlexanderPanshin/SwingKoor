package gui;

import javax.swing.*;
import java.awt.*;

public class BasePanel extends JFrame {
    private JPanel headerKoordinate;
    private JPanel bodyRectangle;
    private JPanel canvasRectangle;
    private JPanel footerKoordinate;
    private JFrame BasePanel;
    public BasePanel() {
        super("SwingKoor");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,400);
        setLayout(new GridLayout(4,1));
        headerKoordinate = new HeaderKoordinat();
        add(headerKoordinate);
        BasePanel = this;
        setVisible(true);
    }

    public JPanel getHeaderKoordinate() {
        return headerKoordinate;
    }

    public JPanel getBodyRectangle() {
        return bodyRectangle;
    }

    public JPanel getCanvasRectangle() {
        return canvasRectangle;
    }

    public JPanel getFooterKoordinate() {
        return footerKoordinate;
    }

    public JFrame getBasePanel() {
        return BasePanel;
    }
}
