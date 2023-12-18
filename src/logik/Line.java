package logik;

import java.util.Objects;

public class Line {
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public Line(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }

    public int getEndX() {
        return endX;
    }

    public int getEndY() {
        return endY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return startX == line.startX && startY == line.startY && endX == line.endX && endY == line.endY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(startX, startY, endX, endY);
    }
}
