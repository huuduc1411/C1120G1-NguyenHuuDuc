package bai6_Inheritance_In_Java.Bai_Tap;

import bai6_Inheritance_In_Java.Bai_Tap.Circle;
import bai6_Inheritance_In_Java.Bai_Tap.Cylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5,"green");
        Cylinder cylinder = new Cylinder(circle.getRadius(), circle.getColor(), 8.4);

        System.out.println(cylinder);
    }
}
