package bai9_Set_Stack_Queue_in_java.Bai_Tap.Demerging_SuDung_Queue;

public class Personnel implements Comparable <Personnel> {
    private String name;
    private String Gender;
    private String birthDay;

    public Personnel(String name, String gender, String birthDay) {
        this.name = name;
        Gender = gender;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "name='" + name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }


    @Override
    public int compareTo(Personnel o) {
        return 0;
    }
}
