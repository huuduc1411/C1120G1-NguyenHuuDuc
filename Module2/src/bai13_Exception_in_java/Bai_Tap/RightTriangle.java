package bai13_Exception_in_java.Bai_Tap;

public class RightTriangle {
    public RightTriangle(int side1, int side2, int side3) throws IllegalTriangleException {
        //cạnh kh âm
        // 2 cạnh bất kỳ cọng lại lơn hơn cạnh còn lại
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
            throw new IllegalTriangleException("Tam giác không hợp lệ !");
        else throw new IllegalTriangleException("Tam giác hợp lệ !");
    }
}
