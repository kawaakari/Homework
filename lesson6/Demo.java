package figures;

public class Demo {

    public static void main(String[] args) {
        Point point = new Point(-1, -1);
        Point point2 = new Point(3, 3);
        Rectangle rectangle = new Rectangle();
        System.out.println(point.countDistance(point, point2));
        System.out.println(rectangle.countArea(point, point2));
        System.out.println(rectangle.countDiagonal(point, point2));
    }
}
