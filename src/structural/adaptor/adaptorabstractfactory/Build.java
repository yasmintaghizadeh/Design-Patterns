package structural.adaptor.adaptorabstractfactory;

import structural.adaptor.adaptorabstractfactory.factory.CarFactory;

public class Build {
    public void build(CarFactory carFactory, CarType model) {

        if (model == CarType.PEUGEOT || model == CarType.DENA) {
            carFactory.createShortChassis().gearbox();
            carFactory.createShortChassis().sunroof();

        } else {
            carFactory.createSuv().motorType();
            carFactory.createSuv().wheels();

        }
    }
}
