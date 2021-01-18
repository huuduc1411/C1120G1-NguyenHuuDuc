package bai9_Set_Stack_Queue_in_java.Bai_Tap.Chuyen_doi_nhi_phan;

import bai9_Set_Stack_Queue_in_java.Bai_Tap.Chuyen_doi_nhi_phan.DecimalToBinary;

import java.util.Scanner;

public class TestDecimalToBinary {
    public static void main(String[] args) {
        int Number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Số Cần chuyển");
        Number = scanner.nextInt();

        System.out.print("Hệ nhị phân của " + Number + " là :");

        new DecimalToBinary().convertBinary(Number);

    }
}
