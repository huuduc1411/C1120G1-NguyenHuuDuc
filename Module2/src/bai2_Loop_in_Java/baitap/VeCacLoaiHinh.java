package bai2_Loop_in_Java.baitap;

import java.util.Scanner;

public class VeCacLoaiHinh {
    public static void main(String[] args) {
        System.out.println(" Menu");
        System.out.println("1. In Hình chữ Nhật");
        System.out.println("2. In Hình Tam Giác vuông");
        System.out.println("3. In Tam Giác Cân");
        System.out.println("4. Exit");
        System.out.print("Enter you choice :");
        Scanner input = new Scanner(System.in);
        while (true){
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("In Hình Chữ Nhật");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.print("Enter you choice");
                    break;
                case 2:
                    System.out.println("In Hình Tam Giác vuông");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Enter You choice");
                    break;
                case 3:
                    System.out.println("In Hình Tam Giác Cân ");
                    for (int i = 0; i < 6 ; i++) {
                        for (int j = 5; j>=i; j--) {
                            System.out.print(" ");
                        }
                        for(int k=0 ; k<=i;k++){
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    System.out.println("Enter you choice");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice");
                    System.out.print("Enter choice");
            }
        }
    }
}
