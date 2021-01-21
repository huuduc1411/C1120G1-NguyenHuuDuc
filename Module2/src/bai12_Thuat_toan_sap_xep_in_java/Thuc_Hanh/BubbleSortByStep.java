package bai12_Thuat_toan_sap_xep_in_java.Thuc_Hanh;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class BubbleSortByStep {
    public static void noiBot(int[] list){
        boolean neddNextPass = true;
        for (int i = 1; i < list.length && neddNextPass ; i++) {
            neddNextPass = false;
            for (int j = 0; j < list.length - i ; j++) {
                if (list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1]= temp;
                    neddNextPass = true;
                }
            }
            if (neddNextPass == false){
                System.out.println("Maảng đã được sắp sếp");
                break;
            }
            System.out.println("Mảng khi sắp xếp" + i );
            for (int k = 0; k < list.length ; k++) {
                System.out.println(list[k] + "\t");
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập Mảng");
        for (int i = 0; i < list.length ; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Mảng của bạn");
        for (int i = 0; i < list.length ; i++) {
            System.out.println(list[i]+ "\t");

        }
        noiBot(list);
    }
}
