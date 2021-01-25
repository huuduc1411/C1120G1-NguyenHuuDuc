package bai13_Exception_in_java.Bai_Tap;

public class IllegalTriangleException extends Exception {
    String thongBao;

    public IllegalTriangleException(String baoLoi){
        thongBao = baoLoi;
    }

    public String getThongBao(){
        return thongBao;
    }
}
