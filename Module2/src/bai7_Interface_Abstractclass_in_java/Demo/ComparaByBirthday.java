package bai7_Interface_Abstractclass_in_java.Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class ComparaByBirthday implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("dd/MM/yyyy");
        Date date1=null;
        Date date2=null;
        try {
            date1 = simpleDateFormat.parse(o1.getBirthDay());
            date2 = simpleDateFormat.parse(o2.getBirthDay());
            return date1.compareTo(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
