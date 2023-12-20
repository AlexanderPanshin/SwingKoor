package logik;

import java.util.ArrayList;

public class MassLine {
    private static ArrayList <Line> massLine;
    private static Rectangle rectangle;

    public MassLine() {
        massLine = new ArrayList<>();
    }

    public static Rectangle getRectangle() {
        return rectangle;
    }

    public static void setRectangle(Rectangle rectangle) {
        MassLine.rectangle = rectangle;
    }

    public static ArrayList<Line> getMassLine() {
        return massLine;
    }
}
