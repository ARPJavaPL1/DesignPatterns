package designpatterns.factory.simplefactory;

public class CarManufacture {

    private SimpleCarFactory factory;

    public CarManufacture(SimpleCarFactory factory) {
        this.factory = factory;
    }

    public void manufactureCar(String type) {
        Car car = factory.createCar(type);

        car.start();
        car.accelerate();
        car.stop();
    }
}
