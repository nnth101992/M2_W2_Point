public class Point3DTest {
    public static void main(String[] args) {
        Point3D point4 = new Point3D();
        System.out.println(point4);

        Point3D point5 = new Point3D();
        point5.setX(2);
        point5.setY(3);
        point5.setZ(1);
        System.out.println(point5);

        Point3D point6 = new Point3D();
        point6.setXYZ(3,3,5);
        System.out.println(point6);
    }
}
