package bai9_Set_Stack_Queue_in_java.Bai_Tap.Demerging_SuDung_Queue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class CombaratorByBirthday implements Comparator <Personnel> {
    @Override
    public int compare(Personnel o1, Personnel o2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
        Date date1 = null;
        Date date2 = null;
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
