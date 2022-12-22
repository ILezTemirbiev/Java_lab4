package lab4_5;

public class Circle extends Shape{
    private double r;
    public Circle(double r , String name)
    {
        super(name);
        this.r=r;
    }
    public double getArea()
    {
        double Area = 0;
        Area = r*r*Math.PI;
        return Area;
    }
    public double getPerimeter()
    {
        double Perimeter=0;
        Perimeter = 2*r*Math.PI;
        return Perimeter;
    }
    public String getType()
    {
        return " (Area: " + getArea() + "  Perimeter: " + getPerimeter()+")";
    }

}
