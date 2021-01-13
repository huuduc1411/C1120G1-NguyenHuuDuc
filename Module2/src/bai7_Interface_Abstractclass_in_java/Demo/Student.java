package bai7_Interface_Abstractclass_in_java.Demo;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String birthDay;

    public Student(String name, int age, String birthDay) {
        this.name = name;
        this.age = age;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.getAge()>o.getAge()){
            return 1;
        }else if (this.getAge()<o.getAge()){
            return -1;
        }else {
            return 0;
        }
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.getName().compareTo(o.getName());
//    }
}
