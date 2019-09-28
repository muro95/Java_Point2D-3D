public class Point2DTest {
    public static void main (String[]args){
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(2.23232f, 5.24742f);
        System.out.println(point2D.toString());
        point2D.setY(1.454634f);
        point2D.setX(2.34353f);
        System.out.println(point2D);
        point2D.setXY(1.3243f,2.535f);
        System.out.println(point2D);
    }
}
