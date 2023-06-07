package structural.adaptor.adaptorabstractfactory.factory;


import structural.adaptor.adaptorabstractfactory.Suv.BmwX3;
import structural.adaptor.adaptorabstractfactory.Suv.Suv;
import structural.adaptor.adaptorabstractfactory.shortchassis.Peugeot;
import structural.adaptor.adaptorabstractfactory.shortchassis.ShortChassis;

public class ModernFactory implements CarFactory {
    @Override
    public Suv createSuv() {
        return new BmwX3();
    }

    @Override
    public ShortChassis createShortChassis() {
        return new Peugeot();
    }
}
