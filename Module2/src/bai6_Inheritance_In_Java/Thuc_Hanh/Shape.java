package bai6_Inheritance_In_Java.Thuc_Hanh;
public class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        String fill;
        if (this.isFilled()) {
            fill = "filled";
        } else {
            fill = "not filled";
        }
        return "A shape with "+
                "color of " + color +
                " and " + fill
                ;
    }
}