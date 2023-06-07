package structural.adaptor.adaptorabstractfactory.Suv;

public class BmwX3 implements Suv {
    @Override
    public void wheels() {
        System.out.println("4 wheels BMW");
    }

    @Override
    public void motorType() {
        System.out.println("10 cylinder BMW");
    }


    @Override
    public void driveSuv(Integer speed) {
        System.out.println("BMW is driving with speed of: "+speed);
    }

    @Override
    public void driveShortChassis(Integer speed) {

    }
}
