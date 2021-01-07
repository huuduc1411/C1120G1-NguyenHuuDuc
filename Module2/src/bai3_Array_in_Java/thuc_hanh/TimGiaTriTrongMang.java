package bai3_Array_in_Java.thuc_hanh;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian" , "Michael","Camila","Sienna","Tanya","Connor","Zachariah","Malory","Zoe","Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên Học Sinh");
        String inputName = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length ; i++) {
            if (students[i].equals(inputName)){
                System.out.println("Vị trí học sinh trong danh sách " + inputName + "Vị Trí" + (i+1));
            }
        }if (!isExit){
            System.out.println("Tên :" + inputName + " " + "Không có trong danh sách");
        }
    }
}
