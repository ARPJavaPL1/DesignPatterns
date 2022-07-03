package designpatterns.factory.abstractfactory.pizza;

public class PizzaComponentFactoryItaly extends PizzaComponentFactory {
    @Override
    public Dough createDough() {
        return new DoughItaly();
    }

    @Override
    public Sauce createSauce() {
        return new SauseItaly();
    }

    @Override
    public Cheese createCheese() {
        return new CheeseItaly();
    }
}
