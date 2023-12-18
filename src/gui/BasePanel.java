package gui;

import javax.swing.*;
import java.awt.*;

public class BasePanel extends JFrame {
    private JPanel headerKoordinate;
    private JPanel bodyRectangle;
    private JPanel footerKoordinate;
    private JFrame BasePanel;
    public BasePanel() {
        super("SwingKoor");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,720);
        //setLayout(new GridLayout(3,1));
        setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
        headerKoordinate = new HeaderKoordinat();
        bodyRectangle = new BodyRectengle();
        footerKoordinate = new FooterKoordinate();
        add(headerKoordinate);
        add(bodyRectangle);
        add(footerKoordinate);
        BasePanel = this;
        setVisible(true);
    }

    public JPanel getHeaderKoordinate() {
        return headerKoordinate;
    }

    public JPanel getBodyRectangle() {
        return bodyRectangle;
    }


    public JPanel getFooterKoordinate() {
        return footerKoordinate;
    }

    public JFrame getBasePanel() {
        return BasePanel;
    }
}
