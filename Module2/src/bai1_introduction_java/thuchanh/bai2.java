package bai1_introduction_java.thuchanh;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width");
        width = scanner.nextFloat();
        System.out.println("enter height");
        height = scanner.nextFloat();
        float dienTich = width*height;
        System.out.println(dienTich);
    }
}
