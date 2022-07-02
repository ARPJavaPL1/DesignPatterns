package designpatterns.decorator.pizza;

public class Cheese extends PizzaComponentDecorator {
    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double price() {
        return pizza.price() + 1.24f;
    }

    @Override
    public String description() {
        return pizza.description() + " " + getClass().getSimpleName();
    }
}
