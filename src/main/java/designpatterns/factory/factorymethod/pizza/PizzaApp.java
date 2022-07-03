package designpatterns.factory.factorymethod.pizza;

import designpatterns.factory.factorymethod.pizza.factory.amerykanska.AmerykanskaPizzeria;
import designpatterns.factory.factorymethod.pizza.factory.Pizzeria;
import designpatterns.factory.factorymethod.pizza.factory.wloska.WloskaPizzeria;
import designpatterns.factory.factorymethod.pizza.product.Pizza;

public class PizzaApp {
    public static void main(String[] args) {

        Pizzeria wloskaPizzeria = new WloskaPizzeria();
        Pizza wloskaPizzaSerowa = wloskaPizzeria.zamowPizza("serowa");
        System.out.println("Zamówiono: " + wloskaPizzaSerowa.pobierzNazwa() + "\n");

        Pizzeria amerykanskaPizzeria = new AmerykanskaPizzeria();
        Pizza amerykanskaPizzaSerowa = amerykanskaPizzeria.zamowPizza("serowa");
        System.out.println("Zamówiono: " + amerykanskaPizzaSerowa.pobierzNazwa() + "\n");
    }
}
