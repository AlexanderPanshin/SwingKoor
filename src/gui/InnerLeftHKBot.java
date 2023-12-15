package gui;

import javax.swing.*;
import java.awt.*;

public class InnerLeftHKBot extends JPanel {
    private JButton addOtr;
    private JButton delOtr;

    public InnerLeftHKBot() {
        setLayout(new BorderLayout());
        addOtr = new JButton("Добавить отрезок");
        delOtr = new JButton("Удалить отрезок");
        add(delOtr, BorderLayout.NORTH);
        add(addOtr,BorderLayout.SOUTH);
    }
}
