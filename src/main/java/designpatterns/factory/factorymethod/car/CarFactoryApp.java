package designpatterns.factory.factorymethod.car;

public class CarFactoryApp {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactoryEurope();
        carFactory.manufactureCar("Ferrari");
        carFactory.manufactureCar("Audi");

        carFactory = new CarFactoryUSA();
        carFactory.manufactureCar("Ferrari");
    }
}
