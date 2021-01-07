package bai5_Access_Modifier.Bai_tap;

import java.awt.geom.Area;

public class Circle {
        private double rarius = 1.10;
        private String clor = "blue";

    public Circle(double rarius, String clor) {
        this.rarius = rarius;
        this.clor = clor;
    }

    public Circle() {
    }

    public double getRarius() {
        return rarius;
    }

    public String getClor() {
        return clor;
    }
    public double getArea(){
        return this.rarius*this.rarius*Math.PI;
    }
//    public static class TestCircle{
//        public static void main(String[] args) {
//            Circle circle = new Circle();
//            System.out.println(circle.rarius);
//            System.out.println(circle.clor);
//        }
//    }
}
