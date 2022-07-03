package designpatterns.factory.simplefactory;

public class SimpleCarFactory {

    public Car createCar(String type) {
        if (type.equals("Audi")) {
            return new Audi();
        } else if (type.equals("Volvo")) {
            return new Volvo();
        } else if (type.equals("Ferrari")) {
            return new Ferrari();
        } else {
            throw new IllegalArgumentException("Unknown car: " + type);
        }
    }
}
