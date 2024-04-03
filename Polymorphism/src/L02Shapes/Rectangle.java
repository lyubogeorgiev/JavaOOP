package L02Shapes;

public class Rectangle extends Shape{
    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    @Override
    void calculatePerimeter() {
        this.setPerimeter(this.height * 2 + this.width * 2);
    }

    @Override
    void calculateArea() {
        this.setArea(this.height * this.width);
    }
}
