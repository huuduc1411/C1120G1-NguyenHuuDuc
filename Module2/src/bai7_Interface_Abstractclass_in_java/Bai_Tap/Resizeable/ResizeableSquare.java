package bai7_Interface_Abstractclass_in_java.Bai_Tap.Resizeable;

import bai6_Inheritance_In_Java.Thuc_Hanh.Square;
import bai7_Interface_Abstractclass_in_java.Bai_Tap.interface_Colorable.Colorable;

public class ResizeableSquare extends Square implements Resizeable , Colorable {
    public ResizeableSquare() {
    }

    public ResizeableSquare(double side) {
        super(side);
    }


    @Override
    public void howToColor() {
        System.out.println("Tô màu cả 4 mặt");
    }

    @Override
    public void resize(double percent) {
        this.setSide(super.getSide()*(1 + percent/100));

    }
}
