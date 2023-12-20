package gui;

import listiner.AddRect;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class FooterCanvas extends JPanel {
    private JButton instanKoor;
    private JButton otobrLine;
    private JPanel canvasPanel;
    private JButton visibleKoor;

    public FooterCanvas() {
        //setLayout(new GridLayout(4,1));
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        ///
        JPanel twoButton = new JPanel();
        twoButton.setLayout(new GridLayout(3,1));
        instanKoor = new JButton("Установить координаты прямоугольной области");
        instanKoor.addActionListener(new AddRect());
        JLabel label = new JLabel("");
        otobrLine = new JButton("Отобразить отрезки и прямоугольную область");
        twoButton.add(instanKoor);
        twoButton.add(label);
        twoButton.add(otobrLine);
        ///
        ///
        JPanel panelCanvas = new JPanel();
        canvasPanel = new JPanel();
        //canvasPanel.setSize(300,200);
        canvasPanel.setPreferredSize(new Dimension(300,200));
        canvasPanel.setBorder(new LineBorder(Color.BLACK));
        panelCanvas.add(canvasPanel);
        ///
        ///
        JPanel oneButtonJpanel = new JPanel(new GridLayout(1,1));
        visibleKoor = new JButton("Отобразить координаты отрезков, пересекающих прямоугольную область");
        oneButtonJpanel.add(visibleKoor);
        ///


        add(twoButton);
        add(panelCanvas);
        add(oneButtonJpanel);
    }
}
