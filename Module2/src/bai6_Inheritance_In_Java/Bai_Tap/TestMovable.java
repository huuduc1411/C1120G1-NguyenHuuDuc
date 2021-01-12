package bai6_Inheritance_In_Java.Bai_Tap;

public class TestMovable {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.5f,5.5f);
        MovablePoint movablePoint = new MovablePoint(4.5f,1.5f);

        movablePoint.setXY(point2D.getX(),point2D.getY());

        System.out.println(movablePoint);

        System.out.println("\n"+movablePoint.move());
        System.out.println(movablePoint.move());
        System.out.println(movablePoint.move());
        System.out.println(movablePoint.move());
        System.out.println(movablePoint.move());
    }
}
