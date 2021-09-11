import java.awt.*;
import java.math.*;

class Circle{
    Point center;
    double radius;

    Circle() {}
    Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    void setCenter(Point center) {
        this.center = center;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }
}

public class exer2 {
    public static void main(String[] args){
        Circle c1 = new Circle(new Point(1,2), 3);
        System.out.println(c1.getArea());
        System.out.println(c1.center);
    }
}
