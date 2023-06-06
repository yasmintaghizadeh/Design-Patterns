package creational.builder;

public class Car {
    private String brand;
    private Integer seats;
    private String engine;
    private Boolean sunroof;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setSunroof(Boolean sunroof) {
        this.sunroof = sunroof;
    }
}
