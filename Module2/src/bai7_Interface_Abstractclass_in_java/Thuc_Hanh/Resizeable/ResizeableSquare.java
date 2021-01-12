package bai7_Interface_Abstractclass_in_java.Thuc_Hanh.Resizeable;

import bai6_Inheritance_In_Java.Thuc_Hanh.Square;

public class ResizeableSquare extends Square implements Resizeable , Colorable{
    public ResizeableSquare() {
    }

    public ResizeableSquare(double side) {
        super(side);
    }


    @Override
    public void howtoColor() {
        System.out.println("Tô màu cả 4 mặt");
    }

    @Override
    public void resize(double percent) {
        this.setSide(super.getSide()*(1 + percent/100));

    }
}
