package logik;

import javax.swing.*;
import java.awt.*;

public class Rectangle extends JComponent {
    private Line ab;
    private Line bc;
    private Line cd;
    private Line da;
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(Dot leftup, Dot rightDown) {
        this.ab = new Line(leftup, new Dot(rightDown.getX(), leftup.getY()));
        this.bc = new Line(new Dot(rightDown.getX(), leftup.getY()),rightDown);
        this.cd = new Line(rightDown,new Dot(leftup.getX(), rightDown.getY()));
        this.da = new Line(new Dot(leftup.getX(), rightDown.getY()),leftup);
        this.x = leftup.getX();
        this.y = leftup.getY();
        this.width = ab.getWidth();
        this.height = bc.getHeight();
    }

    public Line getAb() {
        return ab;
    }

    public Line getBc() {
        return bc;
    }

    public Line getCd() {
        return cd;
    }

    public Line getDa() {
        return da;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Color c = Color.red;
        g2.setColor(c);
        g2.drawRect(x, y, width, height);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(width + x+10, height+y+10);
    }
}
