package designpatterns.factory.factorymethod.pizza.factory.wloska;

import designpatterns.factory.factorymethod.pizza.factory.Pizzeria;
import designpatterns.factory.factorymethod.pizza.product.Pizza;
import designpatterns.factory.factorymethod.pizza.product.wloska.PizzaHawaiiWloska;
import designpatterns.factory.factorymethod.pizza.product.wloska.PizzaMargherittaWloska;
import designpatterns.factory.factorymethod.pizza.product.wloska.PizzaSerowaWloska;

public class WloskaPizzeria extends Pizzeria {

    private String ciasto = "cienkie";

    @Override
    protected Pizza utworzPizza(String type) {
        if (type.equals("serowa")) {
            return new PizzaSerowaWloska(type, ciasto);
        } else if (type.equals("margheritta")) {
            return new PizzaMargherittaWloska(type, ciasto);
        } else if (type.equals("hawaii")) {
            return new PizzaHawaiiWloska(type, ciasto);
        } else {
            throw new IllegalArgumentException("Unknown pizza type " + type);
        }
    }
}
