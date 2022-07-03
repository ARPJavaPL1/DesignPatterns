package designpatterns.factory.abstractfactory.furniture;

public class FurnitureFactoryBoho extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ChairBoho();
    }

    @Override
    public CoffeTable createCoffeeTable() {
        return new CoffeTableBoho();
    }

    @Override
    public Sofa createSofa() {
        return new SofaBoho();
    }
}
