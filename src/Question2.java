class Shape2 {

    public double calculateArea(){
        return 0.0;
    }
}
class Circle2 extends Shape2{
    private int  radius;
    final double PI = 3.14;

    public Circle2(int radius){
        super();
        this.radius=radius;
    }
    @Override
    public double calculateArea(){
        double areaOfCircle = PI*radius*radius;
        System.out.println("the area of the circle is :" + areaOfCircle);
        return areaOfCircle;
    }
}
class Rectangle2 extends Shape2{
    private int length,width;

    public Rectangle2(int length, int width) {
        super();
        this.length=length;
        this.width=width;
    }

    public double calculateArea(){
        double areaOfRectangle = length*width;
        System.out.println("the area of the Rectangle is :" + areaOfRectangle);
        return areaOfRectangle;
    }

}

public class Question2 {
    public static void main(String[] args) {

//        for calculating the area of circle
        Shape2 circle = new Circle2(6);
        circle.calculateArea();

        //        for calculating the area of rectangle
        Shape2 rectangle = new Rectangle2(8,9);
        rectangle.calculateArea();
    }
}
