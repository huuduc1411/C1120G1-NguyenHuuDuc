package bai9_Set_Stack_Queue_in_java.Bai_Tap.Demerging_SuDung_Queue;

public class Personnel {
    private String name;
    private boolean Gender;
    private String birthDay;

    public Personnel(String name, boolean gender, String birthDay) {
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

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean gender) {
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
                ", Gender=" + Gender +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}
