package gui;

import javax.swing.*;
import java.awt.*;

public class HeaderKoordinat extends JPanel {
    private LeftHK leftHK;
    private RightHK rightHK;
    public HeaderKoordinat() {
        setLayout(new BorderLayout());
        leftHK = new LeftHK();
        rightHK = new RightHK();
        add(leftHK, BorderLayout.WEST);
        add(rightHK,BorderLayout.EAST);
    }

    public  LeftHK getLeftHK() {
        return leftHK;
    }

    public RightHK getRightHK() {
        return rightHK;
    }
}
