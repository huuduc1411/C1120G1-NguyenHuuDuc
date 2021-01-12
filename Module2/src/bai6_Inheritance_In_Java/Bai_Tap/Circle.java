package bai6_Inheritance_In_Java.Bai_Tap;

public class Circle {
    protected double radius;
    protected String color;
    protected boolean filled;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius, String color , boolean filled) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle have" +
                " radius = " + radius +
                " and color = " + color;
    }
}
