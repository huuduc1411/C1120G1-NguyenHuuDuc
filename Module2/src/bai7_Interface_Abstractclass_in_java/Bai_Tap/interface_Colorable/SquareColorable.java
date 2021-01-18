package bai7_Interface_Abstractclass_in_java.Bai_Tap.interface_Colorable;

import bai6_Inheritance_In_Java.Thuc_Hanh.Square;

public class SquareColorable extends Square implements Colorable {
    public SquareColorable() {
    }

    public SquareColorable(String color, boolean filled, double side) {
        super(color, filled, side);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all 4 sides");
    }
}
