import java.util.Scanner;

public class TestCircle { // main class
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.radius);
        Circle c2 = new Circle(3);
        System.out.println(c2.radius);
        double a = c1.getArea();
        System.out.printf("Area of C1 = %.2f from radius %.2f\n", a, c1.radius);
        a = c2.getPerimeter();
        System.out.printf("Perimeter of C2 = %.2f from radius %.2f\n", a, c2.radius);
        c1.setRadius(5);
        System.out.printf("Area of C1 = %.2f from radius %.2f\n", c1.getArea(), c1.radius);

    }

}

class Circle {
    double radius; // Global variable

    // Construt method คือ method ที่ชื่อเดียวกับ Class ค่าเริ่มต้นของการประกาศ
    // Object

    Circle() {
        radius = 1;

    }

    // Overide method
    Circle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        // ตัว local variable
        double area = Math.PI * (radius * radius);
        return area;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    void setRadius(double r) {
        radius = r;
    }

}
