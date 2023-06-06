package creational.abstractfactory.factory;

import creational.abstractfactory.sofa.Sofa;
import creational.abstractfactory.chair.Chair;
import creational.abstractfactory.chair.ModernChair;
import creational.abstractfactory.sofa.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }



    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
