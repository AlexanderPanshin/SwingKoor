package logik;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Line extends JComponent {
    private Dot start;
    private Dot end;
    private int width;
    private int height;

    public Line(Dot start, Dot end) {
        this.start = start;
        this.end = end;
        width = end.getX()-start.getX();
        height = end.getY()-start.getY();
    }

    public Dot getStart() {
        return start;
    }

    public Dot getEnd() {
        return end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(start, line.start) && Objects.equals(end, line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Color c = Color.blue;
        g2.setColor(c);
        g2.drawLine(start.getX(),start.getY(),end.getX(),end.getY());
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(width + start.getX()+10, height+end.getY()+10);
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
