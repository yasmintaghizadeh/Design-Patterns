package creational.prototype;

public class Circle extends Shape{
    private int radius;
    private final double PI=3.14;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int id, String color, int radius) {
        super(id, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Object myClone() {
        Circle circle=new Circle(radius);
        super.myClone();
        return circle;
    }
}
