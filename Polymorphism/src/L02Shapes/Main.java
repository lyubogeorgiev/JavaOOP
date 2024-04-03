package L02Shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.0, 4.0);
        Circle circle = new Circle(5.0);

        rectangle.calculateArea();
        System.out.println(rectangle.getArea());
    }
}
