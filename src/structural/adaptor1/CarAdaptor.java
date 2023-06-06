package structural.adaptor1;

public class CarAdaptor implements Car{
    AdvancedCar advancedCar;

    public CarAdaptor(){

    }
    @Override
    public void drive(String model, String speed) {
        if(model.equalsIgnoreCase("porsche")){
            advancedCar=new Pride();
            advancedCar.drivePorsche(model);
        }
        else if(model.equalsIgnoreCase("pride")){
            advancedCar=new Porsche();
            advancedCar.drivePride(model);
        }
    }
}
