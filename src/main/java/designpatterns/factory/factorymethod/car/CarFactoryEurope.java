package designpatterns.factory.factorymethod.car;

public class CarFactoryEurope extends CarFactory {

    @Override
    public Car createCar(String type) {
        if (type.equals("Audi")) {
            return new AudiEurope();
        } else if (type.equals("Volvo")) {
            return new VolvoEurope();
        } else if (type.equals("Ferrari")) {
            return new FerrariEurope();
        } else {
            throw new IllegalArgumentException("Unknown car: " + type);
        }
    }
}
