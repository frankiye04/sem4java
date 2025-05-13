//EX7
class AreaCalculator {
    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }
    public double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
    public double calculateArea(double side) {
        return side * side;
    }
}
public class MethodOverloadingExample {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        double rectangleArea = calculator.calculateArea(10.5, 7.0);
        System.out.println("Area of Rectangle: " + rectangleArea);
        double triangleArea = calculator.calculateArea(8.0, 5.0, true);
        System.out.println("Area of Triangle: " + triangleArea);
        double squareArea = calculator.calculateArea(4.5);
        System.out.println("Area of Square: " + squareArea);
    }
}
