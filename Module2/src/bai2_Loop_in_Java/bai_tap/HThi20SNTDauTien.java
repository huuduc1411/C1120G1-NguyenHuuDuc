package bai2_Loop_in_Java.bai_tap;

public class HThi20SNTDauTien {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number;
//        System.out.println("Nhập số lượng SNT bạn muốn in ra");
//        number = scanner.nextInt();
        int count = 0;
        int countPrime = 0;
        int prime = 2;
        while (count < 20 ){
            countPrime = 0;
            for (int i = 1; i < Math.sqrt(prime) ; i++) {
                if (prime % i == 0){
                    countPrime++;
                }
            }
            if (countPrime == 1){
                System.out.println(prime + " ");
                count++;
            }
            prime++;
        }
    }
}
