package designpatterns.factory.abstractfactory.pizza;

public class PizzaComponentFactoryUSA extends PizzaComponentFactory {
    @Override
    public Dough createDough() {
        return new DoughUSA();
    }

    @Override
    public Sauce createSauce() {
        return new SauceUSA();
    }

    @Override
    public Cheese createCheese() {
        return new CheeseUSA();
    }
}
