package logik;

public class Rectangle {
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
        this.width = rightDown.getX() - leftup.getX();
        this.height = leftup.getY() - rightDown.getY();
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
