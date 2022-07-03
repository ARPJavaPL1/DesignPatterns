package designpatterns.factory.factorymethod.pizza.factory;

import designpatterns.factory.factorymethod.pizza.product.Pizza;

// FABRYKA
public abstract class Pizzeria {
    
    public Pizza zamowPizza(String type) {
        Pizza pizza = utworzPizza(type);

        pizza.przygotowanie();
        pizza.pieczenie();
        pizza.krojenie();
        pizza.pakowanie();

        return pizza;
    }
    
    protected abstract Pizza utworzPizza(String type);
}
