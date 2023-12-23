package gui;

import listiner.AddRect;
import listiner.PaintFigur;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class FooterCanvas extends JPanel {
    private JButton instanKoor;
    private JButton otobrLine;
    private JPanel canvasPanel;
    private JButton visibleKoor;
    private JScrollPane jScrollPane;

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
        otobrLine.addActionListener(new PaintFigur());
        twoButton.add(instanKoor);
        twoButton.add(label);
        twoButton.add(otobrLine);
        ///
        ///
        //JPanel panelCanvas = new JPanel();
        canvasPanel = new JPanel();
        canvasPanel.setLayout(new GridLayout(1,1));
        //canvasPanel.setSize(300,200);
        //canvasPanel.setPreferredSize(new Dimension(297,197));
        canvasPanel.setBorder(new LineBorder(Color.BLACK));
        jScrollPane = new JScrollPane(canvasPanel);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        ///
        /*canvasPanel.setMinimumSize(new Dimension(200, 200));
        canvasPanel.setPreferredSize(new Dimension(400, 182));
        canvasPanel.setMaximumSize(new Dimension(1000, 1000));*/

        jScrollPane.setMinimumSize(new Dimension(300, 200));
        jScrollPane.setPreferredSize(new Dimension(300, 200));
        jScrollPane.setMaximumSize(new Dimension(1000, 1000));


        //panelCanvas.add(jScrollPane);
        ///
        ///
        JPanel oneButtonJpanel = new JPanel(new GridLayout(1,1));
        visibleKoor = new JButton("Отобразить координаты отрезков, пересекающих прямоугольную область");
        oneButtonJpanel.add(visibleKoor);
        ///


        add(twoButton);
        //add(panelCanvas);
        add(jScrollPane);
        add(oneButtonJpanel);
        System.out.println("CreatPanek");
    }

    public JPanel getCanvasPanel() {
        return canvasPanel;
    }

    public JScrollPane getjScrollPane() {
        return jScrollPane;
    }
}
