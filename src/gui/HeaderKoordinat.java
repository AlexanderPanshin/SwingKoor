package gui;

import javax.swing.*;
import java.awt.*;

public class HeaderKoordinat extends JPanel {
    private LeftHK leftHK;
    private RightHK rightHK;
    public HeaderKoordinat() {
        leftHK = new LeftHK();
        rightHK = new RightHK();
        add(leftHK, BorderLayout.WEST);
        add(rightHK,BorderLayout.EAST);
    }
}
