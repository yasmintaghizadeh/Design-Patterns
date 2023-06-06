package structural.adaptorabstractfactory.adaptor;

import structural.adaptorabstractfactory.CarType;
import structural.adaptorabstractfactory.factory.CarFactory;

public interface Driving {
    void drive(CarFactory carModel, CarType model, Integer speed);
}
