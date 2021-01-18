package bai7_Interface_Abstractclass_in_java.Bai_Tap.interface_Colorable;

import bai6_Inheritance_In_Java.Thuc_Hanh.Circle;
import bai6_Inheritance_In_Java.Thuc_Hanh.Shape;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle("blue", true, 15);
        shapes[1] = new Circle("red", false, 10);
        shapes[2] = new Circle("white", false, 10);
        shapes[3] = new Circle("pink", true, 10);
        shapes[4] = new SquareColorable("pink", true, 10);
        

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof SquareColorable) {
                ((Colorable) (shape)).howToColor(); ;
            }

        }
    }
}
