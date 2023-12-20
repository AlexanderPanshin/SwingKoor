package gui;

import javax.swing.*;
import java.awt.*;

public class InLeftRectTopGrid extends JPanel {
    private InLeftRectTopGridPostX inLeftRectTopGridPostX;
    private InLeftRectTopGridPostY inLeftRectTopGridPostY;
    public InLeftRectTopGrid() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        inLeftRectTopGridPostX = new InLeftRectTopGridPostX();
        inLeftRectTopGridPostY = new InLeftRectTopGridPostY();
        add(inLeftRectTopGridPostX);
        add(inLeftRectTopGridPostY);
    }
    public boolean rectTopIsEmpathy() {
        return inLeftRectTopGridPostX.getxTopTextFiled().getText().equals("")&&inLeftRectTopGridPostY.getxTopTextFiled().getText().equals("");
    }
    public int getXrectTop(){
        return Integer.parseInt(inLeftRectTopGridPostX.getxTopTextFiled().getText());
    }
    public int getYrectTop(){
        return Integer.parseInt(inLeftRectTopGridPostY.getxTopTextFiled().getText());
    }
    public void setXrectTop(String s){
        inLeftRectTopGridPostX.getxTopTextFiled().setText(s);
    }
    public void setYrectTop(String s){
        inLeftRectTopGridPostY.getxTopTextFiled().setText(s);
    }
}
