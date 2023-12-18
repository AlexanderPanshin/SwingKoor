package gui;

import listiner.AddLine;
import listiner.DeleteLine;

import javax.swing.*;
import java.awt.*;

public class InnerLeftHKBot extends JPanel {
    private JButton addOtr;
    private JButton delOtr;

    public InnerLeftHKBot() {
        setLayout(new BorderLayout());

        addOtr = new JButton("Добавить отрезок");
        addOtr.addActionListener(new AddLine());
        delOtr = new JButton("Удалить отрезок");
        delOtr.addActionListener(new DeleteLine());
        add(delOtr, BorderLayout.NORTH);
        add(addOtr,BorderLayout.SOUTH);
    }

    public JButton getAddOtr() {
        return addOtr;
    }

    public JButton getDelOtr() {
        return delOtr;
    }
}
