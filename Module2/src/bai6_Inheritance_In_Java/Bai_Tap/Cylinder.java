package bai6_Inheritance_In_Java.Bai_Tap;

import bai6_Inheritance_In_Java.Bai_Tap.Circle;

public class Cylinder extends Circle {
    double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getVolume(){
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder have" +
                " height = " + this.height +
                " , volume = "+ this.getVolume()+
                " which is a subclass of "+ super.toString();
    }
}
