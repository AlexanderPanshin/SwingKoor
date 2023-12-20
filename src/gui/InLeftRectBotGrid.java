package gui;

import javax.swing.*;
import java.awt.*;

public class InLeftRectBotGrid extends JPanel {
    private InLeftRectBotGridPostX inLeftRectBotGridPostX;
    private InLeftRectBotGridPostY inLeftRectBotGridPostY;
    public InLeftRectBotGrid() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        inLeftRectBotGridPostX = new InLeftRectBotGridPostX();
        inLeftRectBotGridPostY = new InLeftRectBotGridPostY();
        add(inLeftRectBotGridPostX);
        add(inLeftRectBotGridPostY);
    }
    public boolean rectBotIsEmpathy(){
        return inLeftRectBotGridPostY.getxBotTextFiled().getText().equals("")&&inLeftRectBotGridPostX.getxBotTextFiled().getText().equals("");
    }
    public int getXrectBot(){
       return Integer.parseInt(inLeftRectBotGridPostX.getxBotTextFiled().getText());
    }
    public int getYrectBot(){
        return Integer.parseInt(inLeftRectBotGridPostY.getxBotTextFiled().getText());
    }
    public void setXrectBot(String s){
        inLeftRectBotGridPostX.getxBotTextFiled().setText(s);
    }
    public void setYrectBot(String s){
        inLeftRectBotGridPostY.getxBotTextFiled().setText(s);
    }
}
