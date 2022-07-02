package designpatterns.decorator.pizza;

public class Capriciosa extends Pizza {
    @Override
    public double price() {
        return 18.49f;
    }

    @Override
    public String description() {
        return getClass().getSimpleName();
    }
}
