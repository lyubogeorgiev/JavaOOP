package L02PointInARectangle;

public class Rectangle {
    private final Point bottomLeft;
    private final Point topRight;

    public Rectangle(int x1, int y1, int x2, int y2){
        this.bottomLeft = new Point(x1, y1);
        this.topRight = new Point(x2, y2);
    }

    public boolean contains(Point point){
        if (this.bottomLeft.getX() > point.getX() || this.topRight.getX() < point.getX()){
            return false;
        }

        return !(this.bottomLeft.getY() > point.getY()) && !(this.topRight.getY() < point.getY());
    }
}
