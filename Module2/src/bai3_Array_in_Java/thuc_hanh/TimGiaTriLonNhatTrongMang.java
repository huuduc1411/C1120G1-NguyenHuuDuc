package bai3_Array_in_Java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the Size");
            size = scanner.nextInt();
            if (size > 5) {
                System.out.println("size kh được lớn hơn 20");
            }
        } while (size > 5);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Proberty list");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }

        }
        System.out.println("Số lớn nhất trong mảng là :" + max + " " + "Tại vị trí :" + index);
    }
}
