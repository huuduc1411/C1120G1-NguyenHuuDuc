package bai3_Array_in_Java.bai_tap;

import java.util.Scanner;

public class ThemVaoMang {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayNew = new int[array.length + 1];
        int number;
        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số muốn thêm vào mảng");
        number = scanner.nextInt();

        do {
            System.out.println("nhập vị trí muốn chèn");
            index = scanner.nextInt();
        } while (index > array.length);
        for (int i = 0; i < index; i++) {
            arrayNew[i] = array[i];
        }
        arrayNew[index] = number;
        for (int i = index; i < array.length; i++) {
            arrayNew[i + 1] = array[i];
        }
        System.out.println("Mang moi gồm: ");
        for (int i = 0; i < arrayNew.length; i++) {
            System.out.print(arrayNew[i] + " ");
        }
    }
}

