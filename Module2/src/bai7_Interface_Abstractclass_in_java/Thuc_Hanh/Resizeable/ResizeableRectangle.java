package bai7_Interface_Abstractclass_in_java.Thuc_Hanh.Resizeable;

import bai6_Inheritance_In_Java.Thuc_Hanh.Rectangle;

public class ResizeableRectangle extends Rectangle implements Resizeable {
    public ResizeableRectangle() {
    }

    public ResizeableRectangle(double width, double length) {
        super(width, length);
    }

    @Override
    public void resize(double percent) {
        this.setWidth(super.getWidth()*(1 + percent/100));
        this.setLength(super.getLength()*(1 + percent/100));

    }
}
