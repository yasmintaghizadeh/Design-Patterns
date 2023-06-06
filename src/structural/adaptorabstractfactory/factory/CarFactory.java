package structural.adaptorabstractfactory.factory;

import structural.adaptorabstractfactory.Suv.Suv;
import structural.adaptorabstractfactory.shortchassis.ShortChassis;

public interface CarFactory {
    Suv createSuv();
    ShortChassis createُShortChassis();
}
