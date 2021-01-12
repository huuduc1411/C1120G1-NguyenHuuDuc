package bai7_Interface_Abstractclass_in_java.Thuc_Hanh.Resizeable;

import bai6_Inheritance_In_Java.Thuc_Hanh.Circle;

public class ResizeableCircle extends Circle implements Resizeable {
    public ResizeableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(double percent) {
        this.setRadius((super.getRadius()*(1 + percent/100)));
    }
}