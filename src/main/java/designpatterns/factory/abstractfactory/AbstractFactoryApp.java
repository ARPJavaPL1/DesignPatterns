package designpatterns.factory.abstractfactory;

public class AbstractFactoryApp {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConcreteFactoryA();
        Product1 product1 = abstractFactory.createProduct1();
        Product2 product2 = abstractFactory.createProduct2();

        System.out.println(product1.getClass().getSimpleName());
        System.out.println(product2.getClass().getSimpleName());
        System.out.println();

        abstractFactory = new ConcreteFactoryB();
        product1 = abstractFactory.createProduct1();
        product2 = abstractFactory.createProduct2();

        System.out.println(product1.getClass().getSimpleName());
        System.out.println(product2.getClass().getSimpleName());
    }
}
