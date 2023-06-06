package structural.adaptorabstractfactory.Suv;

import structural.adaptorabstractfactory.Suv.Suv;

public class Santafe implements Suv {
    @Override
    public void wheels() {
        System.out.println("4 wheel Santafe");
    }

    @Override
    public void motorType() {
        System.out.println("Limited Edition Santafe ");

    }

    @Override
    public void driveSuv(Integer speed) {
        System.out.println("Santafe is driving with speed of " +speed );
    }

    @Override
    public void driveShortChassis(Integer speed) {

    }
}
