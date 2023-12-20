package listiner;


import gui.BasePanel;
import logik.Dot;
import logik.MassLine;
import logik.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRect implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(!BasePanel.getBodyRectangle().getLeftRect().getLeftRectTop().getXyStart().rectTopIsEmpathy()
                && !BasePanel.getBodyRectangle().getLeftRect().getLeftRectBot().getXyEnd().rectBotIsEmpathy()){
            Dot leftUp = new Dot(BasePanel.getBodyRectangle().getLeftRect().getLeftRectTop().getXyStart().getXrectTop(),
                    BasePanel.getBodyRectangle().getLeftRect().getLeftRectTop().getXyStart().getYrectTop());
            Dot rightDown = new Dot(BasePanel.getBodyRectangle().getLeftRect().getLeftRectBot().getXyEnd().getXrectBot(),
                    BasePanel.getBodyRectangle().getLeftRect().getLeftRectBot().getXyEnd().getYrectBot());
            Rectangle rectangle = new Rectangle(leftUp,rightDown);
            MassLine.setRectangle(rectangle);
            BasePanel.getBodyRectangle().getRightRect().getjTextArea().setText("A  =  " + rectangle.getAb().getStart()
            + System.lineSeparator() + "B = " + rectangle.getAb().getEnd() + System.lineSeparator() + "C = " + rectangle.getCd().getStart() +
                    System.lineSeparator() + "D = " + rectangle.getCd().getEnd());

        }
    }
}
