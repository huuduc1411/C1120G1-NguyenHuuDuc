package bai7_Interface_Abstractclass_in_java.Thuc_Hanh.TrienKhai_interface_Comparator;

import bai6_Inheritance_In_Java.Bai_Tap.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius()> o2.getRadius()) return 1;
        else if (o1.getRadius()<o2.getRadius()) return -1;
        else return 0;
    }

}
