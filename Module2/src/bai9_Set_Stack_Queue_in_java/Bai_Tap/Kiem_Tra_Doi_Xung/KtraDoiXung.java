package bai9_Set_Stack_Queue_in_java.Bai_Tap.Kiem_Tra_Doi_Xung;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KtraDoiXung {
    public static void main(String[] args) {
        System.out.println("Nhập chuổi thứ nhất bạn muốn ktra");
        Scanner Chuoi1 = new Scanner(System.in);
        String nhapChuoi = Chuoi1.nextLine();
        Queue queue = new LinkedList();
        for (int i = nhapChuoi.length() - 1; i >=0 ; i--) {
            queue.add(nhapChuoi.charAt(i));
        }
        String reverString = "";
        while (!queue.isEmpty()){
            reverString = reverString+queue.remove();
        }
        if (nhapChuoi.equals(reverString)){
            System.out.println("Đây là chuỗi đối xứng");
        }else {
            System.out.println("đây kh là chuỗi đối xứng");
        }
    }
}
