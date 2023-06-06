package creational.abstractfactory.factory;

import creational.abstractfactory.sofa.Sofa;
import creational.abstractfactory.chair.ArtDecoChair;
import creational.abstractfactory.chair.Chair;
import creational.abstractfactory.sofa.ArtDecoSofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }


    @Override
    public Sofa createSofa() {
            return new ArtDecoSofa();
    }
}
