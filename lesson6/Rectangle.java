package figures;

public class Rectangle {

    private Point point;
    private Point point2;

    public int countArea(Point point, Point point2) {
        return ((point2.getX() - point.getX()) * (point2.getY() - point.getY()));
    }

    public double countDiagonal(Point point, Point point2) {
        return Math.sqrt(((point2.getX() - point.getX()) * (point2.getX() - point.getX())) + ((point2.getY() - point.getY()) * (point2.getY() - point.getY())));
    }
}
