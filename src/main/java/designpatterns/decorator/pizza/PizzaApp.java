package designpatterns.decorator.pizza;

public class PizzaApp {
    public static void main(String[] args) {

        Pizza pizza = new Salami(new Cheese(new Cheese(new Margheritta())));
        System.out.printf("%s %7.2f", pizza.description(), pizza.price());
    }
}
