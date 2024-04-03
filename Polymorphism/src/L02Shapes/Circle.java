package L02Shapes;

public class Circle extends Shape{
    private final Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public final Double getRadius() {
        return this.radius;
    }

    @Override
    void calculatePerimeter() {
        this.setPerimeter(this.radius * 2 * Math.PI);
    }

    @Override
    void calculateArea() {
        this.setArea(Math.PI * this.radius * this.radius);
    }
}
