package designpatterns.decorator.pizza;

public class Salami extends PizzaComponentDecorator {
    private Pizza pizza;

    public Salami(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double price() {
        return pizza.price() + 2f;
    }

    @Override
    public String description() {
        return pizza.description() + " " + getClass().getSimpleName();
    }
}
