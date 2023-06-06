package creational.abstractfactory;

import creational.abstractfactory.factory.FurnitureFactory;

public class Build {
    public void build(FurnitureFactory furnitureFactory){
        furnitureFactory.createChair().hasLegs();
        furnitureFactory.createChair().sitOn();
        furnitureFactory.createSofa().color();

    }
}
