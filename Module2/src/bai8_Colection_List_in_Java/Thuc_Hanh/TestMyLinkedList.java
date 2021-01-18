package bai8_Colection_List_in_Java.Thuc_Hanh;

import bai8_Colection_List_in_Java.Thuc_Hanh.MyLinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("TESTING");
        MyLinkedList myLinkedList = new MyLinkedList(1996);
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(8);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(27);

        myLinkedList.add(2, 1995);
        myLinkedList.printList();
    }
}
