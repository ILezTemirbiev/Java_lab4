package lab4_5;

import static java.lang.Character.getType;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(3 , "Circle");
        Shape s2 = new Rectangle(5,4,"Rectangle");
        System.out.println(s1+s1.getType());
        System.out.println(s2+s2.getType());
    }

}