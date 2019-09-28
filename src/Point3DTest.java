public class Point3DTest {

    public static void main(String[]args){
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(1.3354f,2.3434f, 6.23232f);
        System.out.println(point3D);
        point3D.setX(1.232324f);
        point3D.setY(5.232324f);
        point3D.setZ(7.232324f);
        System.out.println(point3D);
        point3D.setZ(8.232324f);
        System.out.println(point3D);
        point3D.setXYZ(4.53535f,2.6646f,9.353545f);
        System.out.println(point3D);
        point3D.setXYZ(3.53535f,9.6646f,4.323423f);
        System.out.println(point3D);
    }
}
