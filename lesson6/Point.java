package figures;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double countDistance(Point point, Point point2) {
        return Math.sqrt(((point2.x - point.x) * (point2.x - point.x)) + ((point2.y - point.y) * (point2.y - point.y)));
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
