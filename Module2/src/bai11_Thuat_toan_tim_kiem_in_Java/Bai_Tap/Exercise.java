package bai11_Thuat_toan_tim_kiem_in_Java.Bai_Tap;

import java.util.LinkedList;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        // tạo lớp scannar
        Scanner input = new Scanner(System.in);

// Nhắc người dùng nhập một chuỗi
        System.out.println("nhập chuỗi");
        String string = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();

// Tìm dãy con có thứ tự ngày càng lớn nhất
        for (int i = 0; i <string.length() ; i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = 0; j < string.length() ; j++) {
                if (string.charAt(j) > list.getLast()){
                    list.add(string.charAt(i));
                }
            }
            if (list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch : max) {
            System.out.println(ch);
        }


    }
}
