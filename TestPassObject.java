public class TestPassObject {
    public static void main(String[] args) {
        // Create object from Circle
        Circle circle1 = new Circle(4);
        printCircle(circle1);
    }

    public static void printCircle(Circle b) {
        System.out.println("Radius of circle is : " + b.radius);
        System.out.println("Area is : " + b.getArea());
        System.out.println("Perimeter is : " + b.getPerimeter());
    }

}
