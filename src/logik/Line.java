package logik;

import java.util.Objects;

public class Line {
    private Dot start;
    private Dot end;

    public Line(Dot start, Dot end) {
        this.start = start;
        this.end = end;
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
}
