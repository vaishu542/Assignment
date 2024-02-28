// Superclass
class Shape {
    // Method to calculate the area (to be overridden by subclasses)
    public double calculateArea() {
        return 0.0;
    }
}

// Subclass Circle
class Circle extends Shape{
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override calculateArea() method for circles
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override calculateArea() method for rectangles
    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class Question1 {
    public static void main(String[] args) {
        // Creating an array of Shape objects
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Circle(3.0);

        // Iterate through the array and print the area of each shape
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}

