package designpatterns.factory.abstractfactory;

public class ConcreteFactoryB extends AbstractFactory {
    @Override
    public Product1 createProduct1() {
        return new ConcreteProductB1();
    }

    @Override
    public Product2 createProduct2() {
        return new ConcreteProductB2();
    }
}
