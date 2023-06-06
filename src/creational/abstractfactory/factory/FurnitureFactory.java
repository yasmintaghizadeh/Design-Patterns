package creational.abstractfactory.factory;

import creational.abstractfactory.sofa.Sofa;
import creational.abstractfactory.chair.Chair;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}
