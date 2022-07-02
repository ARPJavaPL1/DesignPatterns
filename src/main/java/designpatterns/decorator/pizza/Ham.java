package designpatterns.decorator.pizza;

public class Ham extends PizzaComponentDecorator {
    private Pizza pizza;

    public Ham(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double price() {
        return pizza.price() + 1.5f;
    }

    @Override
    public String description() {
        return pizza.description() + " " + getClass().getSimpleName();
    }
}
