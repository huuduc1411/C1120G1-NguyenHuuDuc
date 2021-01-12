package bai7_Interface_Abstractclass_in_java.Thuc_Hanh.Resizeable;

import bai6_Inheritance_In_Java.Thuc_Hanh.Shape;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new ResizeableRectangle(5.6,5.2);
        shapes[1] = new ResizeableSquare(7.6);
        shapes[2] = new ResizeableCircle(5.4);

        Random random = new Random();




        for(Shape shape : shapes) {
            int percent = random.nextInt(99) +1;
            System.out.println("\nBefore resize : ");

            if (shape instanceof ResizeableRectangle){
                System.out.println("Old Length : "+((ResizeableRectangle) shape).getLength());
                System.out.println("Old Width : "+((ResizeableRectangle) shape).getWidth());
                System.out.println("Old area : "+((ResizeableRectangle) shape).getArea());

            } else if (shape instanceof ResizeableSquare){
                System.out.println("Old size : "+((ResizeableSquare) shape).getSide());
                System.out.println("Old area : "+((ResizeableSquare) shape).getArea());

            } else if (shape instanceof ResizeableCircle){
                System.out.println("Old radius : "+((ResizeableCircle) shape).getRadius());
                System.out.println("Old perimeter : "+((ResizeableCircle) shape).getPerimeter());
            }
            System.out.println("Percent : "+percent+" %");
            System.out.println("After resize : ");

            if (shape instanceof ResizeableRectangle){
                ((ResizeableRectangle) shape).resize(percent);
                System.out.println("New Length : "+((ResizeableRectangle) shape).getLength());
                System.out.println("New Width : "+((ResizeableRectangle) shape).getWidth());
                System.out.println("New area : "+((ResizeableRectangle) shape).getArea());

            } else if (shape instanceof ResizeableSquare){
                ((ResizeableSquare) shape).resize(percent);
                System.out.println("New size : "+((ResizeableSquare) shape).getSide());
                System.out.println("New area : "+((ResizeableSquare) shape).getArea());

            } else if (shape instanceof ResizeableCircle){
                ((ResizeableCircle) shape).resize(percent);
                System.out.println("New radius : "+((ResizeableCircle) shape).getRadius());
                System.out.println("New perimeter : "+((ResizeableCircle) shape).getPerimeter());
            }
        }

    }
}
