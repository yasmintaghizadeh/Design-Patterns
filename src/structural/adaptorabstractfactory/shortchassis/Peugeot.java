package structural.adaptorabstractfactory.shortchassis;

public class Peugeot implements ShortChassis {
    @Override
    public void sunroof() {
        System.out.println("206 does not have sunroof");
    }

    @Override
    public void gearbox() {
        System.out.println("manual 206");
    }

    @Override
    public void driveSuv(Integer speed) {

    }

    @Override
    public void driveShortChassis(Integer speed) {
        System.out.println("Peugeot id driving with speed of: "+speed);
    }
}
