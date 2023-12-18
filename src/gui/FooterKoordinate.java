package gui;

import javax.swing.*;
import java.awt.*;

public class FooterKoordinate extends JPanel {
    private JPanel rightFooter;
    private JPanel leftFooter;
    public FooterKoordinate() {
        setLayout(new BorderLayout());
        leftFooter = new LeftFooter();
        add(leftFooter,BorderLayout.WEST);
    }
}
