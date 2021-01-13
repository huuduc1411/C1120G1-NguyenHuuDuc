package bai7_Interface_Abstractclass_in_java.Demo;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("ngoc",12,"12/12/2000");
        students[1] = new Student("chanh",32,"14/12/2000");
        students[2] = new Student("duc",32,"13/12/2000");
        students[3] = new Student("atung",32,"14/12/2000");
        students[4] = new Student("hieu",18,"14/12/2000");

        for (Student student : students) {
            System.out.println(student.toString());
        }
        Arrays.sort(students);

        System.out.println("sau khi  age");
        for (Student student : students) {
            System.out.println(student.toString());
        }

        Arrays.sort(students, new CompaByName());
        System.out.println("sau khi sort by name");
        for (Student student : students) {
            System.out.println(student.toString());
        }

        Arrays.sort(students,new CompaByAgeAndName());

        System.out.println("sau khi sort by age and name");
        for (Student student : students) {
            System.out.println(student.toString());
        }

        Arrays.sort(students, new ComparaByBirthday());
        System.out.println("sau khi sort by birthday");
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
