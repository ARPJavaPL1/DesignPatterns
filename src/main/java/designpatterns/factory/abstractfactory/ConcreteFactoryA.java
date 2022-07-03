package designpatterns.factory.abstractfactory;

public class ConcreteFactoryA extends AbstractFactory {
    @Override
    public Product1 createProduct1() {
        return new ConcreteProductA1();
    }

    @Override
    public Product2 createProduct2() {
        return new ConcreteProductA2();
    }
}
