package structural.adaptorabstractfactory.factory;


import structural.adaptorabstractfactory.Suv.BmwX3;
import structural.adaptorabstractfactory.Suv.Suv;
import structural.adaptorabstractfactory.shortchassis.Peugeot;
import structural.adaptorabstractfactory.shortchassis.ShortChassis;

public class ModernFactory implements CarFactory {
    @Override
    public Suv createSuv() {
        return new BmwX3();
    }

    @Override
    public ShortChassis createُShortChassis() {
        return new Peugeot();
    }
}
