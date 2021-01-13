package bai7_Interface_Abstractclass_in_java.Demo;

import java.util.Comparator;

public class CompaByAgeAndName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge()>o2.getAge()){
            return 1;
        }else if (o1.getAge()<o2.getAge()){
            return -1;
        }else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
