package gui;

import javax.swing.*;
import java.awt.*;

public class LeftHK extends JPanel {
    private InnerLeftHKTop topPanel;
    private InnerLeftHKBot botPanel;
    public LeftHK() {
        setLayout(new BorderLayout());
        topPanel = new InnerLeftHKTop();
        botPanel = new InnerLeftHKBot();
        add(topPanel, BorderLayout.NORTH);
        add(botPanel,BorderLayout.SOUTH);
    }

    public InnerLeftHKTop getTopPanel() {
        return topPanel;
    }

    public InnerLeftHKBot getBotPanel() {
        return botPanel;
    }
}
