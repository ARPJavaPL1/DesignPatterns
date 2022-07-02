package designpatterns.decorator.car;

public class ColorBlue extends CarAccessoriesDecorator {

    private Car car;

    public ColorBlue(Car car) {
        this.car = car;
    }

    @Override
    public double price() {
        return car.price() + 3600f;
    }

    @Override
    public String description() {
        return car.description() + " blue color";
    }
}
