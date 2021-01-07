package bai4_Class_And_Object_in_Java.Bai_Tap;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.util.Scanner;

public class XayDungLopFan {
    private final String SLOW = "SLOW";
    private final String MEDIUM = "MEDIUM";
    private final String FAST  = "FAST";
    private int speed;
    private boolean on = false;
    private double radius = 5.0;
    private String clor = "blu";

    public XayDungLopFan(int speed, boolean on, double radius, String clor) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.clor = clor;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getClor() {
        return clor;
    }

    public void setClor(String clor) {
        this.clor = clor;
    }

    public XayDungLopFan() {
    }

    public String toString() {
        String tocDo = "";
        switch (speed){
            case 1:
                 tocDo = SLOW;
                 break;
            case 2:
                 tocDo = MEDIUM;
                 
                 break;
            case 3:
               tocDo = FAST;
               break;
            default:
                break;
        }
        if (on == false) {
            return "bán kính" + " " + this.radius + " " + "màu" + " " + this.clor + " " + "quạt đang tắt";
        } else {
            return "tốc độ" + " " + tocDo + " " + "bán kính" + " " + this.radius + " " + "màu" +" "+ this.clor + " " + "quạt đang bật";
        }
    }

    public static void main(String[] args) {
       XayDungLopFan fan1 = new XayDungLopFan(3,true,5,"blue");
       XayDungLopFan fan2 = new XayDungLopFan(3,false,5,"blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }
}


