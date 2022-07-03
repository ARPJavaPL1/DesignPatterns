package designpatterns.factory.factorymethod.car;

public class CarFactoryUSA extends CarFactory {
    @Override
    public Car createCar(String type) {
        if (type.equals("Audi")) {
            return new AudiUSA();
        } else if (type.equals("Volvo")) {
            return new VolvoUSA();
        } else if (type.equals("Ferrari")) {
            return new FerrariUSA();
        } else {
            throw new IllegalArgumentException("Unknown car: " + type);
        }
    }
}
