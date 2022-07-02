package designpatterns.decorator.car;

public class AirConditionAutomatic extends CarAccessoriesDecorator {

    private Car car;

    public AirConditionAutomatic(Car car) {
        this.car = car;
    }

    @Override
    public double price() {
        return car.price() + 2500f;
    }

    @Override
    public String description() {
        return car.description() + " with automatic air condition";
    }
}
