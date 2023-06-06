package creational.prototype;

public class Rectangle extends Shape {
    private int height;
    private int length;

    public Rectangle() {
    }

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public Rectangle(int id, String color, int height, int length) {
        super(id, color);
        this.height = height;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public Object myClone() {
        Rectangle rectangle=new Rectangle(height,length);
         super.myClone();
         return rectangle;
    }
}
