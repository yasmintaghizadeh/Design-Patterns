package structural.adaptorabstractfactory.adaptor;

import structural.adaptorabstractfactory.Build;
import structural.adaptorabstractfactory.CarType;
import structural.adaptorabstractfactory.Suv.BmwX3;
import structural.adaptorabstractfactory.Suv.Santafe;
import structural.adaptorabstractfactory.factory.CarFactory;
import structural.adaptorabstractfactory.factory.ModernFactory;
import structural.adaptorabstractfactory.factory.OldFashionedFactory;
import structural.adaptorabstractfactory.shortchassis.Dena;
import structural.adaptorabstractfactory.shortchassis.Peugeot;

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
