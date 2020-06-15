public class Point2DTest {
    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        System.out.println(point1);

        Point2D point2 = new Point2D();
        point2.setX(3);
        point2.setY(5);
        System.out.println(point2);

        Point2D point3 = new Point2D();
        point3.setXY(2,2);
        System.out.println(point3);
    }
}
