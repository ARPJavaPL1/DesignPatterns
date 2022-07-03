package designpatterns.factory.factorymethod.pizza.factory.amerykanska;

import designpatterns.factory.factorymethod.pizza.factory.Pizzeria;
import designpatterns.factory.factorymethod.pizza.product.Pizza;
import designpatterns.factory.factorymethod.pizza.product.amerykanska.PizzaHawaiiAmerykanska;
import designpatterns.factory.factorymethod.pizza.product.amerykanska.PizzaMargherittaAmerykanska;
import designpatterns.factory.factorymethod.pizza.product.amerykanska.PizzaSerowaAmerykanska;

public class AmerykanskaPizzeria extends Pizzeria {

    private String ciasto = "grube";

    @Override
    protected Pizza utworzPizza(String type) {
        if (type.equals("serowa")) {
            return new PizzaSerowaAmerykanska(type, ciasto);
        } else if (type.equals("margheritta")) {
            return new PizzaMargherittaAmerykanska(type, ciasto);
        } else if (type.equals("hawaii")) {
            return new PizzaHawaiiAmerykanska(type, ciasto);
        } else {
            throw new IllegalArgumentException("Unknown pizza type " + type);
        }
    }
}
