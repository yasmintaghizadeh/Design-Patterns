package structural.adaptor.adaptorabstractfactory.adaptor;

import structural.adaptor.adaptorabstractfactory.CarType;
import structural.adaptor.adaptorabstractfactory.factory.CarFactory;

public interface Driving {
    void drive(CarFactory carModel, CarType model, Integer speed);
}
