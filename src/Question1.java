
class Shape {
    public double calculateArea() {
        return 0.0;
    }
}


class Circle extends Shape{
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class Question1 {
    public static void main(String[] args) {
        // Creating an array of Shape objects
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.7);
        shapes[1] = new Rectangle(4.2, 6.4);
        
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}

