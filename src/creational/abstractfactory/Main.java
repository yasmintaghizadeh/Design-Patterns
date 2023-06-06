package creational.abstractfactory;

import creational.abstractfactory.factory.ArtDecoFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        Build buildChair=new Build();
        buildChair.build(new ArtDecoFurnitureFactory());
    }
}
