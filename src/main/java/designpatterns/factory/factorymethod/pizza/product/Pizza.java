package designpatterns.factory.factorymethod.pizza.product;

import designpatterns.factory.abstractfactory.pizza.Cheese;
import designpatterns.factory.abstractfactory.pizza.Dough;
import designpatterns.factory.abstractfactory.pizza.Sauce;

// PRODUKT
public abstract class Pizza {

    private String nazwa;
    private String ciasto;

    private Dough dought;
    private Sauce sauce;
    private Cheese cheese;

    public Pizza(String nazwa, String ciasto) {
        this.nazwa = nazwa;
        this.ciasto = ciasto;
    }

    public void przygotowanie() {
        System.out.println("przygotowanie " + nazwa + " " + ciasto);
    }

    public void pieczenie() {
        System.out.println("pieczenie " + nazwa + " " + ciasto);
    }

    public void krojenie() {
        System.out.println("krojenie " + nazwa + " " + ciasto);
    }

    public void pakowanie() {
        System.out.println("pakowanie " + nazwa + " " + ciasto);
    }

    public String pobierzNazwa() {
        return nazwa;
    }

    public void setDought(Dough dought) {
        this.dought = dought;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }
}
