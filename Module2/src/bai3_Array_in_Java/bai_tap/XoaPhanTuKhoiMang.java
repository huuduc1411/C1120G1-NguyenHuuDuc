package bai3_Array_in_Java.bai_tap;

import java.util.Scanner;
import java.util.Arrays;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] mangSoNguyen = {10, 6, 6, 7, 8, 6};
        System.out.println("Mảng số nguyên" + Arrays.toString(mangSoNguyen));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số muốn xóa khỏi mảng");
        int soCanXoa = scanner.nextInt();
        int viTriCanXoa = -1;
        for (int i = 0; i < mangSoNguyen.length; i++) {
            if (mangSoNguyen[i] == soCanXoa) {
                for (int j = i; j < mangSoNguyen.length -1; j++) {
                    mangSoNguyen[j] = mangSoNguyen[j + 1];
                }
                i--;
                mangSoNguyen[mangSoNguyen.length-1]= 0;
            }
        }
        System.out.println("Mảng số nguyên" + Arrays.toString(mangSoNguyen));
    }
}