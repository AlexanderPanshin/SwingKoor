package listiner;

import gui.BasePanel;
import logik.Line;
import logik.MassLine;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaintFigur implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (MassLine.getRectangle()!= null){
            Graphics2D g2 = (Graphics2D) BasePanel.getFooterKoordinate().getLeftFooter().getFooterCanvas().getCanvasPanel().getGraphics();
            Color c = Color.red;
            g2.setColor(c);
            g2.drawRect(MassLine.getRectangle().getX(),MassLine.getRectangle().getY(), MassLine.getRectangle().getWidth(), MassLine.getRectangle().getHeight());
            if(MassLine.getMassLine()!=null) {
                for (Line line : MassLine.getMassLine()) {
                    g2.drawLine(line.getStart().getX(), line.getStart().getY(), line.getEnd().getX(), line.getEnd().getY());
                }
            }
            int width = BasePanel.getFooterKoordinate().getLeftFooter().getFooterCanvas().getWidth();
            int height =  BasePanel.getFooterKoordinate().getLeftFooter().getFooterCanvas().getHeight();
            //BasePanel.getFooterKoordinate().getLeftFooter().getFooterCanvas().getCanvasPanel().setPreferredSize(new Dimension(width,height));
            BasePanel.getFooterKoordinate().getLeftFooter().getFooterCanvas().getCanvasPanel().revalidate();
        }
    }
}
