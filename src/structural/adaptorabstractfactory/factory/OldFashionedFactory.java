package structural.adaptorabstractfactory.factory;

import structural.adaptorabstractfactory.Suv.Santafe;
import structural.adaptorabstractfactory.Suv.Suv;
import structural.adaptorabstractfactory.factory.CarFactory;
import structural.adaptorabstractfactory.shortchassis.Dena;
import structural.adaptorabstractfactory.shortchassis.ShortChassis;

public class OldFashionedFactory implements CarFactory {
    @Override
    public Suv createSuv() {
        return new Santafe();
    }

    @Override
    public ShortChassis createُShortChassis() {
        return new Dena();
    }
}
