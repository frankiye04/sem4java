//EX9
interface Shape {
    double getArea();
}
class Rectangle implements Shape {
    private double length;
    private double breadth;
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double getArea() {
        return length * breadth;
    }
}
class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
class Triangle implements Shape {
    private double base;
    private double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getArea() {
        return 0.5 * base * height;
    }
}
public class ShapeInterfaceDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10.0, 5.0);
        Shape circle = new Circle(7.0);
        Shape triangle = new Triangle(8.0, 4.0);
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}
