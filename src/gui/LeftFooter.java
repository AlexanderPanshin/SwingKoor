package gui;

import javax.swing.*;
import java.awt.*;

public class LeftFooter extends JPanel {
    private FooterCanvas footerCanvas;
    private JPanel textAreaConf;

    public LeftFooter() {
        setLayout(new BorderLayout());
        footerCanvas = new FooterCanvas();
        textAreaConf = new TextAreaCon();
        add(footerCanvas,BorderLayout.NORTH);
        add(textAreaConf,BorderLayout.SOUTH);
    }

    public FooterCanvas getFooterCanvas() {
        return footerCanvas;
    }
}
