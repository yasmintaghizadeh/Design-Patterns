package structural.adaptor.adaptorabstractfactory.factory;

import structural.adaptor.adaptorabstractfactory.Suv.Santafe;
import structural.adaptor.adaptorabstractfactory.Suv.Suv;
import structural.adaptor.adaptorabstractfactory.shortchassis.Dena;
import structural.adaptor.adaptorabstractfactory.shortchassis.ShortChassis;

public class OldFashionedFactory implements CarFactory {
    @Override
    public Suv createSuv() {
        return new Santafe();
    }

    @Override
    public ShortChassis createShortChassis() {
        return new Dena();
    }
}
