package designpatterns.factory.abstractfactory.furniture;

public class FurnitureFactoryModern extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ChairModern();
    }

    @Override
    public CoffeTable createCoffeeTable() {
        return new CoffeTableModern();
    }

    @Override
    public Sofa createSofa() {
        return new SofaModern();
    }
}
