package gui;

import logik.Line;
import logik.MassLine;

import javax.swing.*;
import java.awt.*;

public class CanvasCom extends JComponent {
    private int maxWidth;
    private int maxHeight;

    public CanvasCom() {
        maxWidth = 0;
        maxHeight = 0;
    }

    @Override
    public void paintComponent(Graphics g) {
        // Paint its background
        super.paintComponent(g);

        if(!MassLine.getMassLine().isEmpty()){
            for(Line line : MassLine.getMassLine()){
                g.drawLine(line.getStart().getX(),line.getStart().getY(),line.getEnd().getX(),line.getEnd().getY());
                if(maxWidth<line.getEnd().getX()){
                    maxWidth = line.getEnd().getX();
                }
                if(maxHeight<line.getEnd().getY()){
                    maxHeight = line.getEnd().getY();
                }
            }
        }
        // Draw a thicker rectangle using Graphics2D
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4));
        g2d.setColor(Color.BLUE);
        g2d.drawRect(MassLine.getRectangle().getX(), MassLine.getRectangle().getY(), MassLine.getRectangle().getWidth(), MassLine.getRectangle().getHeight());
        if(maxWidth<MassLine.getRectangle().getAb().getEnd().getX()){
            maxWidth=MassLine.getRectangle().getAb().getEnd().getX();
        }
        if(maxHeight<MassLine.getRectangle().getBc().getEnd().getY()){
            maxHeight=MassLine.getRectangle().getBc().getEnd().getY();
        }
    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(maxWidth + 10, maxHeight + 10);
    }
}
