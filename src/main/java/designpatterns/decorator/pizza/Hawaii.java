package designpatterns.decorator.pizza;

public class Hawaii extends Pizza {
    @Override
    public double price() {
        return 21.99f;
    }

    @Override
    public String description() {
        return getClass().getSimpleName();
    }
}
