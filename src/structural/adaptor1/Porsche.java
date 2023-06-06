package structural.adaptor1;

public class Porsche implements AdvancedCar{
    @Override
    public void drivePorsche(String model) {
        System.out.println(model);
    }

    @Override
    public void drivePride(String model) {

    }
}
