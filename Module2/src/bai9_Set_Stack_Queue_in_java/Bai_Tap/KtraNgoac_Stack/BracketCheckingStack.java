package bai9_Set_Stack_Queue_in_java.Bai_Tap.KtraNgoac_Stack;

import java.util.Stack;

public class BracketCheckingStack {
    public static boolean checkingBracket(String str) {
        Stack<Character> stack = new Stack<>();
        if (str.charAt(0) == ')') {
            return false;
        } else {
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    stack.push(str.charAt(i));
                } else if (str.charAt(i) == ')' && stack.isEmpty()) {
                    return false;
                } else if (str.charAt(i) == ')' && !stack.isEmpty()) {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }

    }
    public static void main(String[] args) {
        String str = "s * (s – a) * (s – b * (s – c)";
        if (checkingBracket(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
