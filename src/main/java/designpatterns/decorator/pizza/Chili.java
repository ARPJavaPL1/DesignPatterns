package designpatterns.decorator.pizza;

public class Chili extends PizzaComponentDecorator {
    private Pizza pizza;

    public Chili(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double price() {
        return pizza.price() + 2.2f;
    }

    @Override
    public String description() {
        return pizza.description() + " " + getClass().getSimpleName();
    }
}
