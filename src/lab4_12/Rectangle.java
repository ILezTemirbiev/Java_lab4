package lab4_12;

public class Rectangle extends Shape{
    protected double length;
    protected double width;


    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public double getArea() {
        return width * length ;
    }

    @Override
    public double getPerimiter() {
        return 2 * (width + length) ;
    }

    @Override
    public String toString() {
        return "Rectangle: Area = " + this.getArea() + ";  Perimeter = " + this.getPerimiter();
    }

}
