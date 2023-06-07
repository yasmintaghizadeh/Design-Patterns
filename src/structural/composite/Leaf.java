package structural.composite;

public class Leaf implements Component{
    String name;
    Long price;

    public Leaf(String name, Long price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(name +" : "+price);

    }
}
