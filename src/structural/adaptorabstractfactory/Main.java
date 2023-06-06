package structural.adaptorabstractfactory;

import structural.adaptorabstractfactory.adaptor.CarDriving;

public class Main {
    public static void main(String[] args) {
        CarDriving carDriving=new CarDriving();
        carDriving.drive("old fashion car", CarType.DENA,70);
//        carDriving.drive(CarType.DENA,100);
//        carDriving.drive(CarType.SANTAFE,70);
    }
}
