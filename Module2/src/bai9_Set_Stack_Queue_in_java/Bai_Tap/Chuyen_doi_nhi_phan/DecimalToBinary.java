package bai9_Set_Stack_Queue_in_java.Bai_Tap.Chuyen_doi_nhi_phan;

import java.util.Stack;

public class DecimalToBinary {

    public void convertBinary(int num) {

        Stack<Integer> stack = new Stack<Integer>();

        while (num != 0) {

            //thực hiện phép chia lấy phần dư cho 2.

            int d = num % 2;

            // thêm vào stack.

            stack.push(d);

            num /= 2;

        }

        while (!(stack.isEmpty())) {

            System.out.print(stack.pop());

        }


    }


}