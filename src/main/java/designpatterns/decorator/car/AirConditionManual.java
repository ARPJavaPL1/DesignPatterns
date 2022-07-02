package designpatterns.decorator.car;

public class AirConditionManual extends CarAccessoriesDecorator {

    private Car car;

    public AirConditionManual(Car car) {
        this.car = car;
    }

    @Override
    public double price() {
        return car.price() + 0f;
    }

    @Override
    public String description() {
        return car.description() + " with manual air condition";
    }
}
