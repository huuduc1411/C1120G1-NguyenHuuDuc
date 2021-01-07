package bai4_Class_And_Object_in_Java.Bai_Tap;

import java.util.Scanner;

public class PTrinhBacHai {
    private double a;
    private double b;
    private double c;
    private double delta;
    private double r1;
    private double r2;
    private  double r3;
    public PTrinhBacHai(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        return delta = this.b*this.b - 4 * this.a * this.c;
    }
    public double getRoot1(){
        return r1 = (-this.b + Math.sqrt(this.getDiscriminant())/(2*this.a));
    }
    public double getRoot2(){
        return r2 = (-this.b + Math.sqrt(this.getDiscriminant())/(2*this.a));
    }
    public double getRoot3(){
        return r3 = (-this.b)/2*this.a;
    }

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double x1;
        double x2;
        Scanner scanner = new  Scanner(System.in);

        System.out.println("Enter a");
        a = scanner.nextDouble();
        System.out.println("Enter b");
        b = scanner.nextDouble();
        System.out.println("Enter c");
        c = scanner.nextDouble();

        PTrinhBacHai pt = new PTrinhBacHai(a,b,c);
        if (pt.getDiscriminant() < 0){
            System.out.println("Phương trình vô nghiệm");
        }else if (pt.getDiscriminant()> 0 ){
            System.out.println("Phương trình có 2 nghiệm là " + pt.r1 + "\n" + "x1 = " + pt.getRoot2() + "\n"+ "x2 =" + " " + pt.getRoot1());
        }else {
            System.out.println("phương trình có một nghiệm" + "x1" + " " + pt.getRoot3());
        }

    }
}
