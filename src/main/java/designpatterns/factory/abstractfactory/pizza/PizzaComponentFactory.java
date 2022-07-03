package designpatterns.factory.abstractfactory.pizza;

public abstract class PizzaComponentFactory {
    public abstract Dough createDough();
    public abstract Sauce createSauce();
    public abstract Cheese createCheese();
}
