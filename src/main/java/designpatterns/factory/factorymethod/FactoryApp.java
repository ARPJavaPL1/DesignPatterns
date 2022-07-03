package designpatterns.factory.factorymethod;

public class FactoryApp {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactory1();
        Product product = factory.factoryMethod();

        System.out.println(product.getClass().getSimpleName());

        factory = new ConcreteFactory2();
        product = factory.factoryMethod();

        System.out.println(product.getClass().getSimpleName());
    }
}
