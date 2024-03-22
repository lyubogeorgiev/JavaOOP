package Ex01ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if (this.validateInput(length)) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }

        this.length = length;
    }

    private void setWidth(double width) {
        if (this.validateInput(width)) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }

        this.width = width;
    }

    private void setHeight(double height) {
        if (this.validateInput(height)) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }

        this.height = height;
    }

    public double calculateSurfaceArea() {
        return 2 * this.length * this.width + 2 * this.height * this.width + 2 * this.height * this.length;
    }

    public double calculateLateralSurfaceArea() {
        return 2 * this.width * this.height + 2 * this.length * this.height;
    }

    public double calculateVolume() {
        return this.length * this.width * this.height;
    }

    private boolean validateInput(double value) {
        return value <= 0;
    }
}
