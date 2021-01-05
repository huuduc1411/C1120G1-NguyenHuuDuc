package bai2_Loop_in_Java.baitap;

public class HienThiSNTNhoHon100 {
    public static void main(String[] args) {
        int soKtra = 2, i;
        boolean check;
        System.out.println("Các số Nguyên Tố nhỏ hơn 100 ");
        while (soKtra < 100) {
            check = true;
            i = 2;
            while (i <= Math.sqrt(soKtra)) {
                if (soKtra % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(soKtra + " ");
            }
            soKtra++;
        }

    }
}
