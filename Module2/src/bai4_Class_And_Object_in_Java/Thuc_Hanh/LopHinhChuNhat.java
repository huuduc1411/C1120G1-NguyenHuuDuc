package bai4_Class_And_Object_in_Java.Thuc_Hanh;

import java.util.Scanner;

public class LopHinhChuNhat {
    private double width;
    private double height;

    public LopHinhChuNhat() {
    }

    public LopHinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height)*2;
    }
    public String display(){
        return "width :" + width + " " + "height :" + height;
    }

    public static void main(String[] args) {
        double height;
        double width;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width");
        width = scanner.nextDouble();
        System.out.println("Enter height : ");
        height = scanner.nextDouble();
        LopHinhChuNhat hcn = new LopHinhChuNhat();
        hcn.setHeight(height);
        hcn.setWidth(width);
        System.out.println(hcn.display());
        System.out.println("Area : "+hcn.getArea());
        System.out.println("Perimeter : " +hcn.getPerimeter());
    }
}
