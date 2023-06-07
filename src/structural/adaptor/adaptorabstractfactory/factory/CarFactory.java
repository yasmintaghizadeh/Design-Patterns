package structural.adaptor.adaptorabstractfactory.factory;

import structural.adaptor.adaptorabstractfactory.Suv.Suv;
import structural.adaptor.adaptorabstractfactory.shortchassis.ShortChassis;

public interface CarFactory {
    Suv createSuv();
    ShortChassis createShortChassis();


}
