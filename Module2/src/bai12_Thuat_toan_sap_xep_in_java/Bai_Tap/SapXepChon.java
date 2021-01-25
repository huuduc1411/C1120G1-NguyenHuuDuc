package bai12_Thuat_toan_sap_xep_in_java.Bai_Tap;

public class SapXepChon {
    static int[] list = {1993, 4, 8, 15, 2020, 12, 17};

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Gán phần từ đầu là min, vị trí hiện tại là min index :
            int currentMin = list[i];
            int currentMinIndex = i;

            // Duyệt từ phần tử đầu đến cuối mảng tìm ra phần tử nhỏ nhất và vị trí của phần tử đó :
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Nếu vị trí của phần tử nhỏ nhất khác vị trí bắt đầu thì đổi chỗ :
            if (currentMinIndex != i) {
                // Gán phần tử nhỏ nhất vừa tìm được bằng phần tử đầu :
                list[currentMinIndex] = list[i];
                // Gán  phần tử đầu bằng phần tử nhỏ nhất vừa tìm được :
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int element : list) {
            System.out.print(element + " ");
        }
    }
}
