package bai9_Set_Stack_Queue_in_java.Bai_Tap.Demerging_SuDung_Queue;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Personnel> listPerson = new ArrayList<>();
       listPerson.add(new Personnel("Hoang", "Nu", "10/01/1996"));
       listPerson.add(new Personnel("Thien", "Nam", "12/04/1996"));
       listPerson.add(new Personnel("Tinh", "Nu", "11/07/1996"));
       listPerson.add(new Personnel("Thao", "Nu", "09/07/1996"));
        Queue<Personnel> queueNam = new ArrayDeque<>();
        Queue<Personnel> queueNu = new ArrayDeque<>();
        System.out.println("Pre-sort");
        Collections.sort(listPerson,new CombaratorByBirthday());
        for (Personnel personnel: listPerson) {
            System.out.println(personnel);
        }
        System.out.println("Sort");
        Collections.sort(listPerson,new CombaratorByBirthday());
        for (Personnel person: listPerson) {
            if (person.getGender().equals("Nam")){
                queueNam.add(person);
            }else {
                queueNu.add(person);
            }
        }
        List<Personnel> queuePerson = new ArrayList<>();
        queuePerson.addAll(queueNam);
        queuePerson.addAll(queueNu);
        for (Personnel personDisplay: queuePerson) {
            System.out.println(personDisplay);
        }
    }
}
