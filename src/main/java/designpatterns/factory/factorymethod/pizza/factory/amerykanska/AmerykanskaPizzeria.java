package designpatterns.factory.factorymethod.pizza.factory.amerykanska;

import designpatterns.factory.abstractfactory.pizza.PizzaComponentFactory;
import designpatterns.factory.factorymethod.pizza.factory.Pizzeria;
import designpatterns.factory.factorymethod.pizza.product.Pizza;
import designpatterns.factory.factorymethod.pizza.product.amerykanska.PizzaHawaiiAmerykanska;
import designpatterns.factory.factorymethod.pizza.product.amerykanska.PizzaMargherittaAmerykanska;
import designpatterns.factory.factorymethod.pizza.product.amerykanska.PizzaSerowaAmerykanska;

public class AmerykanskaPizzeria extends Pizzeria {

    private String ciasto = "grube";
    private PizzaComponentFactory pizzaComponentFactory;

    public AmerykanskaPizzeria(PizzaComponentFactory pizzaComponentFactory) {
        this.pizzaComponentFactory = pizzaComponentFactory;
    }

    @Override
    protected Pizza utworzPizza(String type) {

        Pizza pizza;

        if (type.equals("serowa")) {
            pizza = new PizzaSerowaAmerykanska(type, ciasto);
        } else if (type.equals("margheritta")) {
            pizza = new PizzaMargherittaAmerykanska(type, ciasto);
        } else if (type.equals("hawaii")) {
            pizza = new PizzaHawaiiAmerykanska(type, ciasto);
        } else {
            throw new IllegalArgumentException("Unknown pizza type " + type);
        }

        pizza.setCheese(pizzaComponentFactory.createCheese());
        pizza.setDought(pizzaComponentFactory.createDough());
        pizza.setSauce(pizzaComponentFactory.createSauce());

        return pizza;
    }
}
