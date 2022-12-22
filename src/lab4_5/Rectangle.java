package lab4_5;

public class Rectangle extends Shape{
    private double length =0;
    private double width =0;
    public Rectangle(double length,double width , String name)
    {
        super(name);
        this.length=length;
        this.width=width;
    }
    public double getArea()
    {
        double Area =0;
        Area = length*width;
        return Area;
    }
    public double getPerimeter()
    {
        double Perimeter=0;
        Perimeter = 2*(length+width);
        return Perimeter;
    }
    public String getType()
    {
        return " (Area: " + getArea() + " Perimeter: " + getPerimeter()+")";
    }

}
