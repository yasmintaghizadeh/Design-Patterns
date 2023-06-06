package structural.adaptorabstractfactory.adaptor;

import structural.adaptorabstractfactory.CarType;
import structural.adaptorabstractfactory.factory.CarFactory;

public class CarDriving implements Driving {
    CarAdaptor carAdaptor;
    @Override
    public void drive(CarFactory carModel, CarType model, Integer speed) {
            carAdaptor = new CarAdaptor();
            carAdaptor.drive(carModel, model, speed);
    }
}
