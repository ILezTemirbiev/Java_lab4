package lab4_12;

public class Square extends Rectangle{
    protected double side;


    public Square(double side,String color, boolean filled) {
        super(color, filled,0.0,0.0);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        this.side = side;;
    }
    public String toString() {
        return "Rectangle: Area = " + this.getArea() + "; Perimeter = " + this.getPerimiter();
    }

}
