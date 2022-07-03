package designpatterns.factory.factorymethod.car;

public abstract class CarFactory {

    public void manufactureCar(String type) {
        Car car = createCar(type);

        car.start();
        car.accelerate();
        car.stop();
    }

    // metoda wytwórcza
    public abstract Car createCar(String type);
}
