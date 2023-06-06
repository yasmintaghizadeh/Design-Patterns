package creational.prototype;

public class Shape implements ProtoType{

    int id;
    String color;
    public Shape(){

    }

    public Shape(int id, String color) {
        this.id = id;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public Object myClone() {
        Shape shape=new Shape(id,color);
        return shape;
    }
}
