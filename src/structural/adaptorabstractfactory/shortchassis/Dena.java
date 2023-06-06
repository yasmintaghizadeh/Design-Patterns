package structural.adaptorabstractfactory.shortchassis;

import structural.adaptorabstractfactory.shortchassis.ShortChassis;

public class Dena implements ShortChassis {
    @Override
    public void sunroof() {
        System.out.println("dena has sunroof");
    }

    @Override
    public void gearbox() {
        System.out.println("dena is automate");
    }

    @Override
    public void driveSuv(Integer speed) {

    }

    @Override
    public void driveShortChassis(Integer speed) {
        System.out.println("Dena is driving with the speed of: "+speed);
    }
}
