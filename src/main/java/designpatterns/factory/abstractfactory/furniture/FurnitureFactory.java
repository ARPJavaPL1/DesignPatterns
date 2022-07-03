package designpatterns.factory.abstractfactory.furniture;

public abstract class FurnitureFactory {
    public abstract Chair createChair();
    public abstract CoffeTable createCoffeeTable();
    public abstract Sofa createSofa();
}
