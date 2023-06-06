package structural.adaptorabstractfactory.adaptor;

import structural.adaptorabstractfactory.CarType;

public class CarDriving implements Driving {
    CarAdaptor carAdaptor;
    @Override
    public void drive(String carModel, CarType model, Integer speed) {

        if(model.equals(CarType.PEUGEOT) || model.equals(CarType.BMWX3)||model.equals(CarType.SANTAFE)||model.equals(CarType.DENA)){
            carAdaptor = new CarAdaptor();
            carAdaptor.drive(carModel, model, speed);
        }

        else{
            System.out.println("Invalid car model. " + model );
        }
    }
}
