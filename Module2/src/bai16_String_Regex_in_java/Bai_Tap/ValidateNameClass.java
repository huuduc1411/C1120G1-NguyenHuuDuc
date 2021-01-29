package bai16_String_Regex_in_java.Bai_Tap;

import java.util.Scanner;

public class ValidateNameClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter name class: ");
        String nameClass= scanner.nextLine();
        String regexNameClass= "^[CAP]\\d{4}[GHIKLM]";
        if(nameClass.matches( regexNameClass )){
            System.out.println("Name Class Valid");
        }else {
            System.err.println("Name class invalid");
        }
    }

}
