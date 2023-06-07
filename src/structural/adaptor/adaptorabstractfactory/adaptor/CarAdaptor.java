package structural.adaptor.adaptorabstractfactory.adaptor;

import structural.adaptor.adaptorabstractfactory.Build;
import structural.adaptor.adaptorabstractfactory.CarType;
import structural.adaptor.adaptorabstractfactory.Suv.BmwX3;
import structural.adaptor.adaptorabstractfactory.Suv.Santafe;
import structural.adaptor.adaptorabstractfactory.factory.CarFactory;
import structural.adaptor.adaptorabstractfactory.shortchassis.Dena;
import structural.adaptor.adaptorabstractfactory.shortchassis.Peugeot;

public class CarAdaptor implements Driving {
    AdvancedCarDriving advancedCarDriving;
    Build buildCar=new Build();
    @Override
    public void drive(CarFactory carModel, CarType model, Integer speed) {
//        if (carModel.equalsIgnoreCase("old fashion car")){
//            buildCar.build(new OldFashionedFactory(),model);
//        } else if (carModel.equalsIgnoreCase("modern car")) {
//            buildCar.build(new ModernFactory(),model);
//        }

        buildCar.build(carModel,model);
        switch (model){

            case SANTAFE:
                advancedCarDriving=new Santafe();
                advancedCarDriving.driveSuv(speed);
                break;
            case DENA:
                advancedCarDriving=new Dena();
                advancedCarDriving.driveShortChassis(speed);
                break;
            case BMWX3:
                advancedCarDriving=new BmwX3();
                advancedCarDriving.driveSuv(speed);
                break;
            case PEUGEOT:
                advancedCarDriving=new Peugeot();
                advancedCarDriving.driveShortChassis(speed);

                break;
        }
    }
}
