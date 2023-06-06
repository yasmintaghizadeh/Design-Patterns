package structural.adaptor1;

public class Pride implements AdvancedCar{
    @Override
    public void drivePorsche(String model) {

    }

    @Override
    public void drivePride(String model) {
        System.out.println(model);
    }
}
