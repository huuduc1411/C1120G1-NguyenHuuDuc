package bai10_Map_Tree_in_java.Bai_Tap.Luyen_Tap;

import com.sun.javafx.logging.JFRInputEvent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> productsArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int choice = -1;
    public void disPlayMenu(){
        while(choice !=0) {
            System.out.println("1. addProduct" +
                    "\n 2.Sửa" +
                    "\n 3. Xóa" +
                    "\n 4. Hiển Thị" +
                    "\n 5. Tìm Kiếm" +
                    "\n 6. Sắp Xếp");
            System.out.println("Nhập Yêu Cầu Bạn Muốn");
            int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                addProduct();
                break;
            case 2:
                exdit();
                break;
            case 3:
                delete();
                break;
            case 4:
                show();
                break;
            case 5:
               search();
               break;
            case 6:
                sort();
                break;
            default:
                System.out.println("bạn nhập sai.Bạn hãy nhập 1 -> 6");
                break;

        }
    }
    }
public void addProduct(){
    System.out.println("Nhập Tên Sản Phẩm");
    String name = scanner.nextLine();
    System.out.println("Nhập ID Sản Phẩn");
    int id = Integer.parseInt(scanner.nextLine());
    System.out.println("Nhập Giá Sản Phẩm");
    int price = Integer.parseInt(scanner.nextLine());
    Product product = new Product(name,id,price);
    productsArrayList.add(product);
}

public void exdit(){
    System.out.println("Nhập ID sản phẩn muốn sửa");
    int id = Integer.parseInt(scanner.nextLine());
    for (int i = 0; i < productsArrayList.size() ;i++) {
        if (id == productsArrayList.get(i).getId());
        System.out.println("Nhập Tên mới");
        String name = scanner.nextLine();
        productsArrayList.get(i).setName(name);
        System.out.println("nhập lại gia sản phẩn");
        int price = Integer.parseInt(scanner.nextLine());
        productsArrayList.get(i).setPrice(price);
        break;
    }
    }



    public void delete(){
        System.out.println("Nhập id sản phẩn muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        for(Product product : productsArrayList){
            if (id == product.getId()){
                productsArrayList.remove(product);
                break;
            }
        }
    }
    public void search(){
        System.out.println("Nhập Id sản phẩm tìm kiếm");
        String name = scanner.nextLine();
        for (Product product : productsArrayList) {
            if (product.getName().equals(name)){
                System.out.println(product);
            }
        }
    }



    public void sort(){
        Comparator comparator = new Comparator();
        Collections.sort(productsArrayList,comparator);
        for (Product sort: productsArrayList) {
            System.out.println(sort);
        }
    }
    public void show(){
        System.out.println(productsArrayList.toString());
        disPlayMenu();
    }
}
