package gui;

import logik.MassLine;

import javax.swing.*;
import java.awt.*;

public class BasePanel extends JFrame {
    private static HeaderKoordinat headerKoordinate;
    private static BodyRectengle bodyRectangle;
    private JPanel footerKoordinate;
    private static JFrame BasePanel;
    private static MassLine massLine;

    public static MassLine getMassLine() {
        return massLine;
    }

    public BasePanel() {
        super("SwingKoor");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,720);
        massLine = new MassLine();
        //setLayout(new GridLayout(3,1));
        setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
        headerKoordinate = new HeaderKoordinat();
        bodyRectangle = new BodyRectengle();
        footerKoordinate = new FooterKoordinate();
        add(headerKoordinate);
        add(bodyRectangle);
        add(footerKoordinate);
        BasePanel = this;
        setResizable(false);
        setVisible(true);
    }

    public static HeaderKoordinat getHeaderKoordinate() {
        return headerKoordinate;
    }

    public static BodyRectengle getBodyRectangle() {
        return bodyRectangle;
    }


    public JPanel getFooterKoordinate() {
        return footerKoordinate;
    }

    public static JFrame getBasePanel() {
        return BasePanel;
    }
}
