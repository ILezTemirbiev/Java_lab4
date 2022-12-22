package lab4_5;

public class Shape {
    private String name;
    public Shape(String name){
        this.name=name;

    }
    public String getType()
    {
        return name;
    }
    public String toString()
    {
        return "Shape:" + name;
    }
}
