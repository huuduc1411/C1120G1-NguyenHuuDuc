package bai6_Inheritance_In_Java.Thuc_Hanh;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "A Circle with " +
                "radius = " + radius +
                " , which is a subclass of "+super.toString();
    }
}
