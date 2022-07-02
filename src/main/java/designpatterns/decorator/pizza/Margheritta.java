package designpatterns.decorator.pizza;

public class Margheritta extends Pizza {
    @Override
    public double price() {
        return 14.49f;
    }

    @Override
    public String description() {
        return getClass().getSimpleName();
    }
}
