package bai10_Map_Tree_in_java.Thuc_Hanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable_Comparator {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT");
        Student student3 = new Student("Tung", 38, "HT");
        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student st : list) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list, ageComparator);
        System.out.println("So sanh theo tuoi:");
        for (Student st : list) {
            System.out.println(st.toString());
        }
    }
}
