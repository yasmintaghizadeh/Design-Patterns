package structural.adaptor.adaptorabstractfactory;

import structural.adaptor.adaptorabstractfactory.adaptor.CarDriving;
import structural.adaptor.adaptorabstractfactory.factory.OldFashionedFactory;

public class Main {
    public static void main(String[] args) {
        CarDriving carDriving=new CarDriving();
        carDriving.drive(new OldFashionedFactory(), CarType.DENA,70);
//        carDriving.drive(CarType.DENA,100);
//        carDriving.drive(CarType.SANTAFE,70);
    }
}
