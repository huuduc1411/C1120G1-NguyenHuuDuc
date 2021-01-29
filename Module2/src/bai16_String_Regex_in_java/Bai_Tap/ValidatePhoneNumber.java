package bai16_String_Regex_in_java.Bai_Tap;

import java.util.Scanner;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String phoneNumber = scanner.nextLine();
        String regexPhoneNumber= "\\d{2}\\-(0)\\d{9}";
        if (phoneNumber.matches( regexPhoneNumber )){
            System.out.println("Phone number valid");
        }else {
            System.err.println("Phone number invalid");
        }
    }
}
