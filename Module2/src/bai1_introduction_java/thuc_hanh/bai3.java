package bai1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Lesolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a :");
        double a = scanner.nextDouble();
        System.out.println("b :");
        double b = scanner.nextDouble();
        System.out.println("c :");
        double c = scanner.nextDouble();
        if (a != 0){
            double solution = -a / b;
            System.out.printf("The solution is: %f!", solution);
            if (a != 0 ){
                double answer = ( c - b ) / b;
                System.out.printf("Equation pass with x = %f!\n", answer);
        }else {
                if (b == 0) {
                    System.out.print("The solution is all x!");
                } else {
                    System.out.print("No solution!");
                }
            }

        }
    }
}
