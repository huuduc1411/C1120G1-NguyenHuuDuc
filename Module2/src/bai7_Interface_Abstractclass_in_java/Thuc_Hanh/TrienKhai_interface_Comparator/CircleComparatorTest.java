package bai7_Interface_Abstractclass_in_java.Thuc_Hanh.TrienKhai_interface_Comparator;

import bai6_Inheritance_In_Java.Bai_Tap.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6,"Blue",false);
        circles[1] = new Circle(2.1);
        circles[2] = new Circle(6,"Red",true);
        System.out.println("mảng ban đầu");
        for (Circle circle : circles){
            System.out.println(circle);
        }
        Comparator cirleComparator = new CircleComparator();
        Arrays.sort(circles, cirleComparator);
        System.out.println("Sau Sắp xếp");
        for (Circle circle : circles ){
            System.out.println(circle);
        }


    }
}
