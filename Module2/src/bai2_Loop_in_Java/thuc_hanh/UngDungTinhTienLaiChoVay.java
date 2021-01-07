package bai2_Loop_in_Java.thuc_hanh;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner intput = new Scanner(System.in);
        System.out.println("Enter number of months");
        month = intput.nextInt();
        System.out.println("Enter anual tinterset rate percentage: ");
        interset_rate = intput.nextInt();
        double total_interset = 0;
        for (int i = 0; i < month ; i++) {
            total_interset += money*(interset_rate/100)/12*month;
            System.out.println("lãi Suất là :" + total_interset);
        }
    }
}
