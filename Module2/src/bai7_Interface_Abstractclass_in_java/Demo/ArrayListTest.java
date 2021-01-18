package bai7_Interface_Abstractclass_in_java.Demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("chanh", 34,"12/12/2000"));
        list.add(new Student("chanh1", 34,"12/12/2000"));
        list.add(new Student("chanh2", 34,"12/12/2000"));
        for (Student student: list) {
            System.out.println(student);
        }
        ArrayList<Student> arrayList = (ArrayList<Student>) list.clone();
        for (Student student1: arrayList) {
            System.out.println(student1);
        }
    }
}
