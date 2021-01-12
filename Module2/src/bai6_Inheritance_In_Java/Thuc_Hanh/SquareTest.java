package bai6_Inheritance_In_Java.Thuc_Hanh;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        System.out.println("Area : "+square.getArea());

        square = new Square(2.3);
        System.out.println(square);
        System.out.println("Area : "+square.getArea());

        square = new Square( "red", true, 5.8);
        System.out.println(square);
        System.out.println("Area : "+square.getArea());
    }
}