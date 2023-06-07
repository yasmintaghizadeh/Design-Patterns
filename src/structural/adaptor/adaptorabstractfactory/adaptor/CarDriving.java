package structural.adaptor.adaptorabstractfactory.adaptor;

import structural.adaptor.adaptorabstractfactory.CarType;
import structural.adaptor.adaptorabstractfactory.factory.CarFactory;

public class CarDriving implements Driving {
    CarAdaptor carAdaptor;
    @Override
    public void drive(CarFactory carModel, CarType model, Integer speed) {
            carAdaptor = new CarAdaptor();
            carAdaptor.drive(carModel, model, speed);
    }
}
